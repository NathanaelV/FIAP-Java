package br.com.challenge.main;

import br.com.challenge.bean.*;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Classes locais
        Paciente paciente = new Paciente();
        Contato contato = new Contato();
        Endereco endereco = new Endereco();
        RedeCredenciada redeCredenciada;
        Acompanhante acompanhante;
        Contato contatoAcompanhante;
        Consulta consulta;
        Medico medico = new Medico();
        Exame exame;
        Prontuario prontuario = new Prontuario();

        // Definição de Tratamento
        Tratamento tratamento = new Tratamento("A303", "Fisioterapia");

        // Definição do médico
        medico.setCodigoCRM("4253");
        medico.setNome("Donatello");
        medico.setEspecialidade("Ortopedista");
        medico.setDisponibilidadeOnline(true);

        // Definição de Exame
        exame = new Exame(
                "Ressonância Magnética",
                "Inflamação no supraespinhal do ombro esquerdo",
                LocalDate.now(),
                paciente
        );

        // Definições do Prontuário
        prontuario.setExame(exame);
        prontuario.setDescricao("O paciente vem apresentando uma melhora lenta.");


        // Tipos primitivos
        String menuOpcoes, nomePaciente, aux, documento, dataStr, telefone, email, logradouro, numero, complemento,
                bairro, cidade, estado, cep, nomeRede, codigoRede, tipoDePlano, nomeAcompanhante, assuntoOcorrencia,
                textoOcorrencia, localConsulta, parentesco, consultaInfo, prontuarioInfo;
        int escolha, opcaoAcompanhante, escolhaMenu;
        boolean telOuEmail, consultaRemarcada = false;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento, dataHora;


        do {
            try {
                menuOpcoes = "--- Bem-vindo ao Sistema VitalLink Tecnologia! ---\n\n" +
                        "Escolha uma opção:\n" +
                        "(1) Criar Paciente\n" +
                        "(2) Logar Paciente\n" +
                        "(0) Sair\n\n" +
                        "Digite sua opção: ";
                aux = JOptionPane.showInputDialog(menuOpcoes);
                escolha = Integer.parseInt(aux);
//                escolha = 2;

                switch (escolha) {
                    case 1:
                        // Cadastrar Paciente
                        paciente = new Paciente();
                        do {
                            nomePaciente = JOptionPane.showInputDialog("\n--- Menu do Paciente ---\nVamos cadastrar suas informações.\n\nNome do Paciente (Obrigatório)");
//                            nomePaciente = "Raph";
                            paciente.setNome(nomePaciente);
                        } while (paciente.getNome().isEmpty());

                        do {
                            dataStr = JOptionPane.showInputDialog("Data de Nascimento (DD/MM/YYYY) (Obrigatório)");
//                            dataStr = "05/04/2000";
                            try {
                                dataNascimento = LocalDate.parse(dataStr, dtf);
                                paciente.setDataNascimento(dataNascimento);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY.");
                            }
                        } while (paciente.getDataNascimento() == null);

                        do {
                            documento = JOptionPane.showInputDialog("Documento (CPF) (Obrigatório - somente números)");
//                            documento = "12312312344";
                            paciente.setDocumento(documento);
                        } while (paciente.getDocumento().isEmpty());

                        // Contato
                        do {
                            telefone = JOptionPane.showInputDialog("Número para contato incluindo DDD");
//                            telefone = "123456789";
                            contato.setTelefone(telefone);

                            email = JOptionPane.showInputDialog("Email para contato");
//                            email = "meu@email.com";
                            contato.setEmail(email);

                            telOuEmail = contato.getTelefone().length() < 11 && contato.getEmail().isEmpty();
                            if (telOuEmail) {
                                JOptionPane.showMessageDialog(null, "Digite pelo menos uma informação para contato");
                            }
                        } while (telOuEmail);

                        paciente.setContato(contato);

                        // Endereço
                        do {
                            logradouro = JOptionPane.showInputDialog("Cadastrar endereço do usuário\n\nLogradouro (Obrigatório)");
//                            logradouro = "Av. Lins de Vasconcelos";
                            endereco.setLogradouro(logradouro);
                        } while (endereco.getLogradouro().isEmpty());

                        do {
                            numero = JOptionPane.showInputDialog("Número (Obrigatório)");
//                            numero = "1222";
                            endereco.setNumero(numero);
                        } while (endereco.getNumero().isEmpty());

                        complemento = JOptionPane.showInputDialog("Complemento");
//                        complemento = "";
                        endereco.setComplemento(complemento);

                        do {
                            bairro = JOptionPane.showInputDialog("Bairro (Obrigatório)");
//                            bairro = "Aclimação";
                            endereco.setBairro(bairro);
                        } while (endereco.getBairro().isEmpty());

                        do {
                            cidade = JOptionPane.showInputDialog("Cidade (Obrigatório)");
//                            cidade = "São Paulo";
                            endereco.setCidade(cidade);
                        } while (endereco.getCidade().isEmpty());

                        do {
                            estado = JOptionPane.showInputDialog("Estado (Obrigatório)");
//                            estado = "SP";
                            endereco.setEstado(estado);
                        } while (endereco.getEstado().isEmpty());

                        do {
                            cep = JOptionPane.showInputDialog("CEP (Obrigatório - somente números)");
//                            cep = "01001000";
                            endereco.setCep(cep);
                        } while (endereco.getCep().length() != 8);

                        paciente.setEndereco(endereco);


                        // Informações específicas do Paciente

                        // Rede Credenciada
                        do {
                            nomeRede = JOptionPane.showInputDialog("--- Rede Credenciada ---\n\nNome da Rede Credenciada (Obrigatório)");
//                            nomeRede = "Unimad";
                        } while (nomeRede.isEmpty());


                        codigoRede = JOptionPane.showInputDialog("Digite o código do Convênio");
//                        codigoRede = "472";

                        do {
                            tipoDePlano = JOptionPane.showInputDialog("Digite o tipo de plano (Obrigatório)");
//                            tipoDePlano = "Básico";
                        } while (tipoDePlano.isEmpty());

                        redeCredenciada = new RedeCredenciada(nomeRede, codigoRede, tipoDePlano);
                        paciente.setRedeCredenciada(redeCredenciada);


                        // Acompanhante

                        opcaoAcompanhante = JOptionPane.showConfirmDialog(
                                null,
                                "O paciente possui um acompanhante?",
                                "Terá paciente?",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE
                        );
//                        opcaoAcompanhante = JOptionPane.NO_OPTION;

                        if (opcaoAcompanhante == JOptionPane.YES_OPTION) {
                            acompanhante = new Acompanhante();

                            do {
                                nomeAcompanhante = JOptionPane.showInputDialog("\n--- Menu do Acompanhante ---\n\nNome do Acompanhante (Obrigatório) ");
//                                nomeAcompanhante = "Michelangelo";
                                acompanhante.setNome(nomeAcompanhante);
                            } while (acompanhante.getNome().isEmpty());

                            do {
                                dataStr = JOptionPane.showInputDialog("Data de Nascimento (DD/MM/YYYY) (Obrigatório)");
//                                dataStr = "05/04/2002";
                                try {
                                    dataNascimento = LocalDate.parse(dataStr, dtf);
                                    acompanhante.setDataNascimento(dataNascimento);
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY.");
                                }
                            } while (acompanhante.getDataNascimento() == null);

                            do {
                                documento = JOptionPane.showInputDialog("Documento (CPF) (Obrigatório - somente números)");
//                                documento = "12312312344";
                                acompanhante.setDocumento(documento);
                            } while (acompanhante.getDocumento().isEmpty());

                            // Contato
                            contatoAcompanhante = new Contato();
                            do {
                                telefone = JOptionPane.showInputDialog("Número para contato");
//                                telefone = "123456789";
                                contatoAcompanhante.setTelefone(telefone);

                                email = JOptionPane.showInputDialog("Email para contato");
//                                email = "meu@email.com";
                                contatoAcompanhante.setEmail(email);

                                telOuEmail = contatoAcompanhante.getTelefone().isEmpty() && contatoAcompanhante.getEmail().isEmpty();
                                if (telOuEmail) {
                                    JOptionPane.showMessageDialog(null, "Digite pelo menos uma informação para contato");
                                }
                            } while (telOuEmail);

                            // Grau parentesco
                            do {
                                parentesco = JOptionPane.showInputDialog("Qual o grau parentesco?");
//                                parentesco = "Irmão";
                                acompanhante.setGrauParentesco(parentesco);
                            } while (parentesco.isEmpty());


                            acompanhante.setContato(contatoAcompanhante);
                            paciente.setAcompanhante(acompanhante);
                        }

                        // Display patient information
                        String patientInfo = "=== Patient Information ===\n" +
                                "Nome: " + paciente.getNome() + "\n" +
                                "Data de nascimento: " + paciente.dataFormatada() + "\n" +
                                "Idade: " + paciente.idade() + "\n" +
                                "CPF: " + paciente.getDocumento() + "\n" +
                                "Número de cadastro: " + paciente.getNumeroCadastro() + "\n\n" +
                                "Informações de contato:\n" +
                                "  Telefone: " + paciente.getContato().getTelefone() + "\n" +
                                "  E-mail: " + paciente.getContato().getEmail();
                        JOptionPane.showMessageDialog(null, patientInfo);

                        String addressInfo = "=== Address Information ===\n" +
                                "Rua: " + endereco.getLogradouro() + "\n" +
                                "Número: " + paciente.getEndereco().getNumero() + "\n" +
                                "Complemento: " + paciente.getEndereco().getComplemento() + "\n" +
                                "Bairro: " + paciente.getEndereco().getBairro() + "\n" +
                                "Cidade: " + paciente.getEndereco().getCidade() + "\n" +
                                "Estado: " + paciente.getEndereco().getEstado() + "\n" +
                                "CEP: " + paciente.getEndereco().getCep();
                        JOptionPane.showMessageDialog(null, addressInfo);

                        String healthcareInfo = "=== Healthcare Network ===\n" +
                                "Rede Credẽnciada: " + paciente.getRedeCredenciada().getNome() + "\n" +
                                "Códio da Rede: " + paciente.getRedeCredenciada().getCodigoConvenio() + "\n" +
                                "Tipo do Plano: " + paciente.getRedeCredenciada().getTipoDePlano();
                        JOptionPane.showMessageDialog(null, healthcareInfo);

                        if (paciente.getAcompanhante() != null) {
                            String accompanistInfo = "=== Accompanying Person ===\n" +
                                    "Nome: " + paciente.getAcompanhante().getNome() + "\n" +
                                    "Data de nascimento: " + paciente.getAcompanhante().dataFormatada() + "\n" +
                                    "Idade: " + paciente.getAcompanhante().idade() + "\n" +
                                    "CPF: " + paciente.getAcompanhante().getDocumento() + "\n\n" +
                                    "Informações de contato:\n" +
                                    "  Telefone: " + paciente.getAcompanhante().getContato().getTelefone() + "\n" +
                                    "  E-mail: " + paciente.getAcompanhante().getContato().getEmail();
                            JOptionPane.showMessageDialog(null, accompanistInfo);
                        }

                        
                        // Menu de Paciente
                        
                        // Menu de opções
                        do {
                            try {
                                menuOpcoes = "Bem vindo(a), " + paciente.getNome() + "!\n\n" +
                                        "Escolha uma opção:\n\n" +
                                        "(1) Abrir Ocorrência\n" +
                                        "(2) Marcar Consulta\n" +
                                        "(3) Remarcar Consulta\n" +
                                        "(4) Mostrar Consultas Marcadas\n" +
                                        "(5) Prontuário do Paciente\n" +
                                        "(0) Sair\n\n" +
                                        "Digite sua opção: ";

                                aux = JOptionPane.showInputDialog(menuOpcoes);
                                escolhaMenu = Integer.parseInt(aux);

                                switch (escolhaMenu) {

                                    // Abrir ocorrência
                                    case 1:
                                        do {
                                            assuntoOcorrencia = JOptionPane.showInputDialog("Tema da ocorrência");
//                                            assuntoOcorrencia = "Consulta online";
                                        } while (assuntoOcorrencia.isEmpty());

                                        do {
                                            textoOcorrencia = JOptionPane.showInputDialog("Qual a ocorrência:");
//                                            textoOcorrencia = "Não consigo encontrar a tela para conectar.";
                                        } while (textoOcorrencia.isEmpty());

                                        paciente.abreOcorrencia(assuntoOcorrencia, textoOcorrencia);
                                        break;

                                    // Marcar Consulta
                                    case 2:
                                        consulta = new Consulta();
                                        do {
                                            localConsulta = JOptionPane.showInputDialog("Consulta será PRESENCIAL ou ONLINE?");
//                                            localConsulta = "ONLINE";
                                            consulta.setLocal(localConsulta);
                                        } while (consulta.getLocal().isEmpty());

                                        // Data da consulta
                                        do {
                                            dataStr = JOptionPane.showInputDialog("Data da consulta (DD/MM/YYYY) (Obrigatório)");
//                                            dataStr = "05/04/2030";

                                            try {
                                                dataHora = LocalDate.parse(dataStr, dtf);
                                                consulta.setDataHora(dataHora);
                                            } catch (Exception e) {
                                                JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY. \n");
                                            }
                                        } while (consulta.getDataHora() ==  null);

                                        // Informações definidas pelo Hospital
                                        consulta.setMedico(medico);
                                        consulta.setTratamento(tratamento);
                                        consulta.setProntuario(prontuario);
                                        paciente.setConsulta(consulta);
                                        prontuario.setPaciente(paciente);

                                        break;

                                    // Remarcar Consulta
                                    case 3:
                                        if (paciente.getConsulta() == null) {
                                            JOptionPane.showMessageDialog(null, "Paciente não possui consultas para serem reagendadas.");
                                        } else {
                                            do {
                                                dataStr = JOptionPane.showInputDialog("Nova data da consulta (DD/MM/YYYY) (Obrigatório)");
//                                                dataStr = "25/11/2030";

                                                try {
                                                    dataHora = LocalDate.parse(dataStr, dtf);
                                                    consultaRemarcada = paciente.getConsulta().remarcar(dataHora);
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY. \n");
                                                }
                                            } while (!consultaRemarcada);
                                        }

                                        break;

                                    // Mostrar Consultas Marcadas
                                    case 4:
                                        if (paciente.getConsulta() == null) {
                                            JOptionPane.showMessageDialog(null, "Paciente não possui consultas para serem mostradas.");
                                        } else {
                                            consultaInfo = "=== Consulta Marcada ===\n" +
                                                    "Data: " + paciente.getConsulta().dataFormatada() + "\n" +
                                                    "Local: " + paciente.getConsulta().getLocal() + "\n" +
                                                    "Tratamento: " + paciente.getConsulta().getTratamento().getNome();
                                            JOptionPane.showMessageDialog(null, consultaInfo);
                                        }
                                        break;

                                    // Prontuário do Paciente
                                    case 5:
                                        if (paciente.getProntuario() == null) {
                                            JOptionPane.showMessageDialog(null, "Paciente não possui prontuário.");
                                        } else {
                                            prontuarioInfo = "=== Prontuário do Paciente ===\n" +
                                                    "Descrição: " + prontuario.getDescricao() + "\n\n" +
                                                    "=== Exame ===\n" +
                                                    "  Nome: " + prontuario.getExame().getNome() + "\n" +
                                                    "  Data: " + prontuario.getExame().dataFormatada() + "\n" +
                                                    "  Obs: " + prontuario.getExame().getObservacoes() + "\n";
                                            JOptionPane.showMessageDialog(null, prontuarioInfo);
                                        }
                                        break;

                                    // Sair
                                    case 0:
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Por favor digite um número válido!\n");
                                escolhaMenu = -1;
                            }
                        } while (escolhaMenu != 0);
                        break;

                    // Logar Paciente:
                    case 2:
                        // Verifica se o paciente existe
                        if (paciente.getDocumento() == null) {
                            JOptionPane.showMessageDialog(null, "Paciente não cadastrado. Favor cadastrar o paciente.");
                        } else {
                            do {
                                try {
                                    menuOpcoes = "Bem vindo(a), " + paciente.getNome() + "!\n\n" +
                                            "Escolha uma opção:\n\n" +
                                            "(1) Abrir Ocorrência\n" +
                                            "(2) Marcar Consulta\n" +
                                            "(3) Remarcar Consulta\n" +
                                            "(4) Mostrar Consultas Marcadas\n" +
                                            "(5) Prontuário do Paciente\n" +
                                            "(0) Sair\n\n" +
                                            "Digite sua opção: ";

                                    aux = JOptionPane.showInputDialog(menuOpcoes);
                                    escolhaMenu = Integer.parseInt(aux);

                                    switch (escolhaMenu) {
                                        // Abrir ocorrência
                                        case 1:
                                            do {
                                                assuntoOcorrencia = JOptionPane.showInputDialog("Tema da ocorrência");
//                                                assuntoOcorrencia = "Consulta online";
                                            } while (assuntoOcorrencia.isEmpty());

                                            do {
                                                textoOcorrencia = JOptionPane.showInputDialog("Qual a ocorrência:");
//                                                textoOcorrencia = "Não consigo encontrar a tela para conectar.";
                                            } while (textoOcorrencia.isEmpty());

                                            paciente.abreOcorrencia(assuntoOcorrencia, textoOcorrencia);
                                            break;

                                        // Marcar Consulta
                                        case 2:
                                            consulta = new Consulta();
                                            do {
                                                localConsulta = JOptionPane.showInputDialog("Consulta será PRESENCIAL ou ONLINE?");
//                                                localConsulta = "ONLINE";
                                                consulta.setLocal(localConsulta);
                                            } while (consulta.getLocal().isEmpty());

                                            // Data da consulta
                                            do {
                                                dataStr = JOptionPane.showInputDialog("Data da consulta (DD/MM/YYYY) (Obrigatório)");
//                                                dataStr = "05/04/2030";

                                                try {
                                                    dataHora = LocalDate.parse(dataStr, dtf);
                                                    consulta.setDataHora(dataHora);
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY. \n");
                                                }
                                            } while (consulta.getDataHora() ==  null);

                                            consulta.setMedico(medico);
                                            consulta.setTratamento(tratamento);
                                            paciente.setConsulta(consulta);

                                            break;

                                        // Remarcar Consulta
                                        case 3:
                                            if (paciente.getConsulta() == null) {
                                                JOptionPane.showMessageDialog(null, "Paciente não possui consultas para serem reagendadas.");
                                            } else {
                                                do {
                                                    dataStr = JOptionPane.showInputDialog("Nova data da consulta (DD/MM/YYYY) (Obrigatório)");
//                                                    dataStr = "25/11/2030";

                                                    try {
                                                        dataHora = LocalDate.parse(dataStr, dtf);
                                                        consultaRemarcada = paciente.getConsulta().remarcar(dataHora);
                                                    } catch (Exception e) {
                                                        JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY. \n");
                                                    }
                                                } while (!consultaRemarcada);
                                            }
                                            break;

                                        // Mostrar Consultas Marcadas
                                        case 4:
                                            if (paciente.getConsulta() == null) {
                                                JOptionPane.showMessageDialog(null, "Paciente não possui consultas para serem mostradas.");
                                            } else {
                                                consultaInfo = "=== Consulta Marcada ===\n" +
                                                        "Data: " + paciente.getConsulta().dataFormatada() + "\n" +
                                                        "Local: " + paciente.getConsulta().getLocal() + "\n" +
                                                        "Tratamento: " + paciente.getConsulta().getTratamento().getNome();
                                                JOptionPane.showMessageDialog(null, consultaInfo);
                                            }
                                            break;

                                        // Mostrar Prontuário do Paciente
                                        case 5:
                                            if (paciente.getProntuario() == null) {
                                                JOptionPane.showMessageDialog(null, "Paciente não possui prontuário.");
                                            } else {
                                                prontuarioInfo = "=== Prontuário do Paciente ===\n" +
                                                        "Descrição: " + prontuario.getDescricao() + "\n\n" +
                                                        "=== Exame ===\n" +
                                                        "  Nome: " + prontuario.getExame().getNome() + "\n" +
                                                        "  Data: " + prontuario.getExame().dataFormatada() + "\n" +
                                                        "  Obs: " + prontuario.getExame().getObservacoes() + "\n";
                                                JOptionPane.showMessageDialog(null, prontuarioInfo);
                                            }
                                            break;

                                        case 0:
                                            break;

                                        default:
                                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "Por favor digite um número válido!\n");
                                    escolhaMenu = -1;
                                }
                            } while (escolhaMenu != 0);
                        }
                        break;

                    case 0:
                        JOptionPane.showMessageDialog(null, "Obrigado por usar o Sistema VitalLink Tecnologia!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha novamente.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, digite um número.");
                escolha = -1;
            }

        } while (escolha != 0);
    }
}

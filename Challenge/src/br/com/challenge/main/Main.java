package br.com.challenge.main;

import br.com.challenge.bean.*;

import javax.swing.*;
import java.text.CompactNumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Classes locais
        Paciente paciente = new Paciente();
        RedeCredenciada redeCredenciada;
        Acompanhante acompanhante;
        Contato contatoAcompanhante;
        Consulta consulta;

        // Tipos primitivos
        String menuOpcoes, nomePaciente, aux, documento, dataStr, telefone, email, logradouro, numero, complemento,
                bairro, cidade, estado, cep, nomeRede, codigoRede, tipoDePlano, nomeAcompanhante, assuntoOcorrencia,
                textoOcorrencia, localConsulta, parentesco;
        int escolha, numeroCadastro, opcaoAcompanhante, escolhaMenu;
        boolean telOuEmail, consultaRemarcada = false;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento, dataHora;

        // Valores pré-definidos
        Tratamento tratamento = new Tratamento("A303", "Fisioterapia");

        do {
            try {
                menuOpcoes = "--- Bem-vindo ao Sistema VitalLink Tecnologia! ---\n\n" +
                        "Escolha seu perfil:\n" +
                        "(1) Criar Paciente\n" +
                        "(2) Logar Paciente\n" +
                        "(2) Médico\n" +
                        "(0) Sair\n\n" +
                        "Digite sua opção: ";
                aux = JOptionPane.showInputDialog(menuOpcoes);
                escolha = Integer.parseInt(aux);
//                escolha = 2;

                switch (escolha) {
                    case 1:
                        // Cadastrar Paciente
//                        paciente = new Paciente();

                        do {
//                            nomePaciente = JOptionPane.showInputDialog("\n--- Menu do Paciente ---\nVamos cadastrar suas informações.\n\nNome do Paciente (Obrigatório)");
                            nomePaciente = "Raph";
                            paciente.setNome(nomePaciente);
                        } while (paciente.getNome().isEmpty());

                        do {
//                            dataStr = JOptionPane.showInputDialog("Data de Nascimento (DD/MM/YYYY) (Obrigatório)");
                            dataStr = "05/04/2000";
                            try {
                                dataNascimento = LocalDate.parse(dataStr, dtf);
                                paciente.setDataNascimento(dataNascimento);
                                System.out.println("\n\n" + dataNascimento);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY.");
                            }
                        } while (paciente.getDataNascimento() == null);

                        do {
//                            documento = JOptionPane.showInputDialog("Documento (CPF) (Obrigatório - somente números)");
                            documento = "12312312344";
                            paciente.setDocumento(documento);
                        } while (paciente.getDocumento().isEmpty());

                        // Contato
                        paciente.setContato(new Contato());

                        do {
//                            telefone = JOptionPane.showInputDialog("Número para contato");
                            telefone = "123456789";
                            paciente.getContato().setTelefone(telefone);

//                            email = JOptionPane.showInputDialog("Email para contato");
                            email = "meu@email.com";
                            paciente.getContato().setEmail(email);

                            telOuEmail = paciente.getContato().getTelefone().isEmpty() && paciente.getContato().getEmail().isEmpty();
                            System.out.println(telOuEmail);
                            if (telOuEmail) {
                                JOptionPane.showMessageDialog(null, "Digite pelo menos uma informação para contato");
                            }
                        } while (telOuEmail);


                        // Endereço
                        paciente.setEndereco(new Endereco());
                        do {
//                            logradouro = JOptionPane.showInputDialog("Cadastrar endereço do usuário\n\nLogradouro (Obrigatório)");
                            logradouro = "Av. Lins de Vasconcelos";
                            paciente.getEndereco().setLogradouro(logradouro);
                        } while (paciente.getEndereco().getLogradouro().isEmpty());

                        do {
//                            numero = JOptionPane.showInputDialog("Número (Obrigatório)");
                            numero = "1222";
                            paciente.getEndereco().setNumero(numero);
                        } while (paciente.getEndereco().getNumero().isEmpty());

//                        complemento = JOptionPane.showInputDialog("Complemento");
                        complemento = "";
                        paciente.getEndereco().setComplemento(complemento);

                        do {
//                            bairro = JOptionPane.showInputDialog("Bairro (Obrigatório)");
                            bairro = "Aclimação";
                            paciente.getEndereco().setBairro(bairro);
                        } while (paciente.getEndereco().getBairro().isEmpty());

                        do {
//                            cidade = JOptionPane.showInputDialog("Cidade (Obrigatório)");
                            cidade = "São Paulo";
                            paciente.getEndereco().setCidade(cidade);
                        } while (paciente.getEndereco().getCidade().isEmpty());

                        do {
//                            estado = JOptionPane.showInputDialog("Estado (Obrigatório)");
                            estado = "SP";
                            paciente.getEndereco().setEstado(estado);
                        } while (paciente.getEndereco().getEstado().isEmpty());

                        do {
//                            cep = JOptionPane.showInputDialog("CEP (Obrigatório - somente números)");
                            cep = "01538001";
                            paciente.getEndereco().setCep(cep);
                        } while (paciente.getEndereco().getCep().isEmpty());


                        // Informações específicas do Paciente

                        // Número de cadastro
                        do {
                            try {
//                                aux = JOptionPane.showInputDialog("Número de cadastro (Não pode ser Zero)");
                                aux = "12345";
                                numeroCadastro = Integer.parseInt(aux);
                                paciente.setNumeroCadastro(numeroCadastro);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Digite um número válido diferente de zero.");
                                paciente.setNumeroCadastro(0);
                            }
                        } while (paciente.getNumeroCadastro() == 0);


                        // Rede Credenciada
                        do {
//                            nomeRede = JOptionPane.showInputDialog("--- Rede Credenciada ---\n\nNome da Rede Credenciada (Obrigatório)");
                            nomeRede = "Unimad";
                        } while (nomeRede.isEmpty());


//                        codigoRede = JOptionPane.showInputDialog("Digite o código do Convênio: ");
                        codigoRede = "472";

                        do {
//                            tipoDePlano = JOptionPane.showInputDialog("Digite o tipo de plano: ");
                            tipoDePlano = "Básico";
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

                        if (opcaoAcompanhante == JOptionPane.YES_OPTION) {
                            acompanhante = new Acompanhante();

                            do {
//                            nomeAcompanhante = JOptionPane.showInputDialog("\n--- Menu do Acompanhante ---\n\nNome do Acompanhante (Obrigatório) ");
                                nomeAcompanhante = "Michelangelo";
                                acompanhante.setNome(nomeAcompanhante);
                            } while (acompanhante.getNome().isEmpty());

                            do {
//                            dataStr = JOptionPane.showInputDialog("Data de Nascimento (DD/MM/YYYY) (Obrigatório)");
                                dataStr = "05/04/2002";
                                try {
                                    dataNascimento = LocalDate.parse(dataStr, dtf);
                                    acompanhante.setDataNascimento(dataNascimento);
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY.");
                                }
                            } while (acompanhante.getDataNascimento() == null);

                            do {
//                            documento = JOptionPane.showInputDialog("Documento (CPF) (Obrigatório - somente números)");
                                documento = "12312312344";
                                acompanhante.setDocumento(documento);
                            } while (acompanhante.getDocumento().isEmpty());

                            // Contato
                            contatoAcompanhante = new Contato();
                            do {
//                            telefone = JOptionPane.showInputDialog("Número para contato");
                                telefone = "123456789";
                                contatoAcompanhante.setTelefone(telefone);

//                            email = JOptionPane.showInputDialog("Email para contato");
                                email = "meu@email.com";
                                contatoAcompanhante.setEmail(email);

                                telOuEmail = contatoAcompanhante.getTelefone().isEmpty() && contatoAcompanhante.getEmail().isEmpty();
                                System.out.println(telOuEmail);
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
                                "Rua: " + paciente.getEndereco().getLogradouro() + "\n" +
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
                                        "(0) Sair\n\n" +
                                        "Digite sua opção: ";

                                aux = JOptionPane.showInputDialog(menuOpcoes);
                                escolhaMenu = Integer.parseInt(aux);

                                switch (escolhaMenu) {
                                    case 1:
                                        // Abrir ocorrência
                                        do {
//                                            assuntoOcorrencia = JOptionPane.showInputDialog("Tema da ocorrência");
                                            assuntoOcorrencia = "Consulta online";
                                        } while (assuntoOcorrencia.isEmpty());

                                        do {
//                                            textoOcorrencia = JOptionPane.showInputDialog("Qual a ocorrência:");
                                            textoOcorrencia = "Não consigo encontrar a tela para conectar.";
                                        } while (textoOcorrencia.isEmpty());

                                        paciente.abreOcorrencia(assuntoOcorrencia, textoOcorrencia);
                                        break;
                                    case 2:
                                        // Marcar Consulta
                                        consulta = new Consulta();
                                        do {
//                                            localConsulta = JOptionPane.showInputDialog("Consulta será PRESENCIAL ou ONLINE?");
                                            localConsulta = "ONLINE";
                                            consulta.setLocal(localConsulta);
                                        } while (consulta.getLocal().isEmpty());

                                        // Data da consulta
                                        do {
//                                            dataStr = JOptionPane.showInputDialog("Data da consulta (DD/MM/YYYY) (Obrigatório)");
                                            dataStr = "05/04/2030";

                                            try {
                                                dataHora = LocalDate.parse(dataStr, dtf);
                                                consulta.setDataHora(dataHora);
                                            } catch (Exception e) {
                                                JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY. \n" + e.getMessage());
                                            }
                                        } while (consulta.getDataHora() ==  null);

                                        consulta.setTratamento(tratamento);
                                        paciente.setConsulta(consulta);

                                        break;
                                    case 3:
                                        // Remarcar Consulta

                                        if (paciente.getConsulta() == null) {
                                            JOptionPane.showMessageDialog(null, "Paciente não possui consultas para serem reagendadas.");
                                        } else {
                                            do {
//                                                dataStr = JOptionPane.showInputDialog("Nova data da consulta (DD/MM/YYYY) (Obrigatório)");
                                                dataStr = "25/11/2030";

                                                try {
                                                    dataHora = LocalDate.parse(dataStr, dtf);
                                                    consultaRemarcada = paciente.getConsulta().remarcar(dataHora);
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY. \n" + e.getMessage());
                                                }
                                            } while (!consultaRemarcada);
                                        }

                                        break;
                                    case 0:
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Por favor digite um número válido!\n" + e.getMessage());
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
                                            "(0) Sair\n\n" +
                                            "Digite sua opção: ";

                                    aux = JOptionPane.showInputDialog(menuOpcoes);
                                    escolhaMenu = Integer.parseInt(aux);

                                    switch (escolhaMenu) {
                                        case 1:
                                            // Abrir ocorrência
                                            do {
//                                            assuntoOcorrencia = JOptionPane.showInputDialog("Tema da ocorrência");
                                                assuntoOcorrencia = "Consulta online";
                                            } while (assuntoOcorrencia.isEmpty());

                                            do {
//                                            textoOcorrencia = JOptionPane.showInputDialog("Qual a ocorrência:");
                                                textoOcorrencia = "Não consigo encontrar a tela para conectar.";
                                            } while (textoOcorrencia.isEmpty());

                                            paciente.abreOcorrencia(assuntoOcorrencia, textoOcorrencia);
                                            break;
                                        case 2:
                                            // Marcar Consulta
                                            consulta = new Consulta();
                                            do {
//                                            localConsulta = JOptionPane.showInputDialog("Consulta será PRESENCIAL ou ONLINE?");
                                                localConsulta = "ONLINE";
                                                consulta.setLocal(localConsulta);
                                            } while (consulta.getLocal().isEmpty());

                                            // Data da consulta
                                            do {
//                                            dataStr = JOptionPane.showInputDialog("Data da consulta (DD/MM/YYYY) (Obrigatório)");
                                                dataStr = "05/04/2030";

                                                try {
                                                    dataHora = LocalDate.parse(dataStr, dtf);
                                                    consulta.setDataHora(dataHora);
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY. \n" + e.getMessage());
                                                }
                                            } while (consulta.getDataHora() ==  null);

                                            consulta.setTratamento(tratamento);
                                            paciente.setConsulta(consulta);

                                            break;
                                        case 3:
                                            // Remarcar Consulta

                                            if (paciente.getConsulta() == null) {
                                                JOptionPane.showMessageDialog(null, "Paciente não possui consultas para serem reagendadas.");
                                            } else {
                                                do {
//                                                dataStr = JOptionPane.showInputDialog("Nova data da consulta (DD/MM/YYYY) (Obrigatório)");
                                                    dataStr = "25/11/2030";

                                                    try {
                                                        dataHora = LocalDate.parse(dataStr, dtf);
                                                        consultaRemarcada = paciente.getConsulta().remarcar(dataHora);
                                                    } catch (Exception e) {
                                                        JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use DD/MM/YYYY. \n" + e.getMessage());
                                                    }
                                                } while (!consultaRemarcada);
                                            }

                                            break;
                                        case 0:
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "Por favor digite um número válido!\n" + e.getMessage());
                                    escolhaMenu = -1;
                                }
                            } while (escolhaMenu != 0);
                        }
                        break;

                    // MÉDICO:
                    case 3:
//                        menuMedico(scanner);
                        System.out.println("médico 2 foi cadastrado com sucesso!");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Obrigado por usar o Sistema VitalLink Tecnologia!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, digite um número.");
                System.out.println(e);
                System.out.println("\n");
                System.out.println(e.getMessage());
//                scanner.nextLine(); // Consumir a entrada inválida
                // Para garantir que o loop continue
                escolha = -1;
            }

        } while (escolha != 0);
    }

//    private static void menuMedico(Scanner scanner) {
//        System.out.println("\n--- Menu do Médico ---");
//        System.out.println("Vamos cadastrar suas informações.");
//
//        Medico medico = criarMedico(scanner);
//        if (medico == null) {
//            System.out.println("Cadastro de médico cancelado ou inválido.");
//            return;
//        }
//
//        int opcaoMedico;
//        do {
//            System.out.println("\nMédico: Dr(a). " + medico.getNome());
//            System.out.println("1. Adicionar um Relatório a uma Consulta (simulado)");
//            System.out.println("2. Acessar Prontuário de um Paciente (simulado)");
//            System.out.println("0. Voltar ao Menu Principal");
//            System.out.print("Sua opção: ");
//
//            try {
//                opcaoMedico = scanner.nextInt();
//                scanner.nextLine(); // Consumir a nova linha
//
//                switch (opcaoMedico) {
//                    case 1:
//                        System.out.println("--- Adicionar Relatório ---");
//                        System.out.print("Digite o código da consulta para adicionar o relatório: ");
//                        int codigoConsulta = scanner.nextInt();
//                        scanner.nextLine();
//                        System.out.print("Digite o texto do relatório: ");
//                        String textoRelatorio = scanner.nextLine();
//                        Consulta consultaDummy = new Consulta(); // Criando uma consulta dummy para o teste
//                        consultaDummy.setCodigo(codigoConsulta);
//                        consultaDummy.adicionaRelatorio(medico, textoRelatorio);
//                        System.out.println("Relatório adicionado à consulta " + codigoConsulta + " com sucesso!");
//                        break;
//                    case 2:
//                        System.out.println("--- Acessar Prontuário ---");
//                        System.out.println("Simulando acesso a um prontuário. Em um sistema real, você buscaria por um paciente.");
//                        // Criando um prontuário dummy com paciente dummy para demonstração
//                        Paciente pacienteDummy = new Paciente("Paciente Teste", LocalDate.of(1980, 5, 10), "987654321", new Endereco(), new Contato(), 12345, null, null);
//                        Prontuario prontuarioDummy = new Prontuario(pacienteDummy, new ArrayList<>(), "Anotações iniciais do prontuário teste.");
//                        prontuarioDummy.addExame(new Exame(101, "Hemograma Completo", "Resultados normais."));
//
//                        System.out.println("Prontuário de: " + prontuarioDummy.getPaciente().getNome());
//                        System.out.println("Anotações: " + prontuarioDummy.getAnotacoes());
//                        System.out.println("Exames:");
//                        for (Exame exame : prontuarioDummy.getExames()) {
//                            System.out.println("  - Código: " + exame.getCodigo() + ", Nome: " + exame.getNome() + ", Observações: " + exame.getObservacoes());
//                        }
//                        break;
//                    case 0:
//                        System.out.println("Voltando ao Menu Principal...");
//                        break;
//                    default:
//                        System.out.println("Opção inválida. Por favor, escolha novamente.");
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
//                scanner.nextLine(); // Consumir a entrada inválida
//                opcaoMedico = -1;
//            }
//        } while (opcaoMedico != 0);
//    }

//    private static Paciente criarPaciente(Scanner scanner) {
//
//    }

//    private static Medico criarMedico(Scanner scanner) {
//        System.out.print("Nome do Médico: ");
//        String nome = scanner.nextLine();
//
//        LocalDate dataNascimento = null;
//        boolean dataValida = false;
//        while (!dataValida) {
//            System.out.print("Data de Nascimento (DD/MM/YYYY): ");
//            String dataStr = scanner.nextLine();
//            try {
//                dataNascimento = LocalDate.parse(dataStr, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//                dataValida = true;
//            } catch (DateTimeParseException e) {
//                System.out.println("Erro: Formato de data inválido. Use DD/MM/YYYY.");
//            }
//        }
//
//        System.out.print("Documento (CPF/RG): ");
//        String documento = scanner.nextLine();
//
//        // Criando Endereço
//        System.out.println("--- Endereço ---");
//        System.out.print("Logradouro: ");
//        String logradouro = scanner.nextLine();
//        System.out.print("Número: ");
//        String numero = scanner.nextLine();
//        System.out.print("Complemento (opcional): ");
//        String complemento = scanner.nextLine();
//        System.out.print("Bairro: ");
//        String bairro = scanner.nextLine();
//        System.out.print("Cidade: ");
//        String cidade = scanner.nextLine();
//        System.out.print("Estado: ");
//        String estado = scanner.nextLine();
//        int cep = 0;
//        boolean cepValido = false;
//        while (!cepValido) {
//            System.out.print("CEP (apenas números): ");
//            try {
//                cep = scanner.nextInt();
//                scanner.nextLine();
//                cepValido = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Erro: CEP inválido. Digite apenas números.");
//                scanner.nextLine();
//            }
//        }
//        Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);
//
//        // Criando Contato
//        System.out.println("--- Contato ---");
//        System.out.print("Telefone: ");
//        String telefone = scanner.nextLine();
//        System.out.print("Email: ");
//        String email = scanner.nextLine();
//        Contato contato = new Contato(telefone, email);
//
//        System.out.print("Código CRM: ");
//        String codigoCRM = scanner.nextLine();
//
//        boolean disponibilidadeOnline = false;
//        boolean inputValido = false;
//        while (!inputValido) {
//            System.out.print("Disponibilidade Online (true/false): ");
//            String resp = scanner.nextLine().toLowerCase();
//            if (resp.equals("true")) {
//                disponibilidadeOnline = true;
//                inputValido = true;
//            } else if (resp.equals("false")) {
//                disponibilidadeOnline = false;
//                inputValido = true;
//            } else {
//                System.out.println("Erro: Resposta inválida. Digite 'true' ou 'false'.");
//            }
//        }
//
//        System.out.print("Especialidade (Nome): ");
//        String nomeEspecialidade = scanner.nextLine();
//        Especialidade especialidade = new Especialidade(1, nomeEspecialidade); // Código dummy
//
//        Medico medico = new Medico(nome, dataNascimento, documento, endereco, contato, codigoCRM, disponibilidadeOnline, especialidade);
//        System.out.println("Médico Dr(a). " + medico.getNome() + " cadastrado com sucesso!");
//        return medico;
//    }
}
package br.com.challenge.main;

import br.com.challenge.bean.*;

import javax.swing.*;
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
        Paciente paciente = new Paciente();
        String nomePaciente, aux, documento, dataStr, telefone, email, logradouro, numero, complemento, bairro, cidade,
                estado, cep;
        int escolha, numeroCadastro, codigoCRM;
        boolean telOuEmail;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento;


        do {
            try {
//                aux = JOptionPane.showInputDialog("--- Bem-vindo ao Sistema VitalLink Tecnologia! ---\n\nEscolha seu perfil:\n(1) Paciente\n(2) Médico\n(0) Sair\n\nSua opção: ");
//                escolha = Integer.parseInt(aux);
                escolha = 1;

                switch (escolha) {
                    case 1:
                        // Paciente
                        do {
//                            nomePaciente = JOptionPane.showInputDialog("\n--- Menu do Paciente ---\nVamos cadastrar suas informações.\n\nNome do Paciente (Obrigatório) ");
                            nomePaciente = "Raph";
                            paciente.setNome(nomePaciente);
                        } while (paciente.getNome().isEmpty());

                        do {
//                            dataStr = JOptionPane.showInputDialog("Data de Nascimento (DD/MM/YYYY) (Obrigatório")");
                            dataStr = "05/04/2020";
                            try {
                                dataNascimento = LocalDate.parse(dataStr, dtf);
                                paciente.setDataNascimento(dataNascimento);
                                System.out.println(dataNascimento);
                            } catch (DateTimeParseException e) {
                                System.out.println("Erro: Formato de data inválido. Use DD/MM/YYYY.");
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
                            logradouro = "Rua Teste";
                            paciente.getEndereco().setLogradouro(logradouro);
                        } while (paciente.getEndereco().getLogradouro().isEmpty());

                        do {
//                            numero = JOptionPane.showInputDialog("Número (Obrigatório)");
                            numero = "123";
                            paciente.getEndereco().setNumero(numero);
                        } while (paciente.getEndereco().getNumero().isEmpty());

                        complemento = JOptionPane.showInputDialog("Complemento");
                        paciente.getEndereco().setComplemento(complemento);

                        do {
                            bairro = JOptionPane.showInputDialog("Bairro (Obrigatório)");
                            paciente.getEndereco().setBairro(bairro);
                        } while (paciente.getEndereco().getBairro().isEmpty());

                        do {
                            cidade = JOptionPane.showInputDialog("Cidade (Obrigatório)");
                            paciente.getEndereco().setCidade(cidade);
                        } while (paciente.getEndereco().getCidade().isEmpty());

                        do {
                            estado = JOptionPane.showInputDialog("Estado (Obrigatório)");
                            paciente.getEndereco().setEstado(estado);
                        } while (paciente.getEndereco().getEstado().isEmpty());

                        do {
                            cep = JOptionPane.showInputDialog("CEP (Obrigatório - somente números)");
                            paciente.getEndereco().setCep(cep);
                        } while (paciente.getEndereco().getCep().isEmpty());


                        // Informações específicas do Paciente


//                        int numeroCadastro = 0;
//                        boolean numCadastroValido = false;
//                        while (!numCadastroValido) {
//                            System.out.print("Número de Cadastro do Paciente: ");
//                            try {
//                                numeroCadastro = scanner.nextInt();
//                                scanner.nextLine();
//                                numCadastroValido = true;
//                            } catch (InputMismatchException e) {
//                                System.out.println("Erro: Número de cadastro inválido. Digite apenas números.");
//                                scanner.nextLine();
//                            }
//                        }
//
//                        // Simulação de Rede Credenciada
//                        System.out.println("--- Rede Credenciada ---");
//                        System.out.print("Nome da Rede Credenciada (ex: Unimed): ");
//                        String nomeRede = scanner.nextLine();
//                        System.out.print("Código do Convênio: ");
//                        String codigoConvenio = scanner.nextLine();
//                        System.out.print("Tipo de Plano: ");
//                        String tipoPlano = scanner.nextLine();
//                        RedeCredenciada redeCredenciada = new RedeCredenciada(nomeRede, codigoConvenio, tipoPlano);
//
//                        // Acompanhante (opcional)
//                        Acompanhante acompanhante = null;
//                        System.out.print("O paciente possui um acompanhante? (sim/não): ");
//                        String respostaAcompanhante = scanner.nextLine().toLowerCase();
//                        if (respostaAcompanhante.equals("sim")) {
//                            System.out.print("Nome do Acompanhante: ");
//                            String nomeAcompanhante = scanner.nextLine();
//                            // Data de nascimento, documento, endereço e contato do acompanhante seriam solicitados aqui,
//                            // mas para simplificar, usaremos dados dummy para o acompanhante.
//                            acompanhante = new Acompanhante(nomeAcompanhante, LocalDate.of(1990, 1, 1), "AcompanhanteDoc", new Endereco(), new Contato());
//                        }
//
//                        // Criando o prontuário do paciente
//                        Prontuario prontuario = new Prontuario(null, new ArrayList<>(), "Prontuário criado no cadastro.");
//
//                        Paciente paciente = new Paciente(nomePaciente, dataNascimento, documento, endereco, contato, numeroCadastro, redeCredenciada, acompanhante);
//                        paciente.setProntuario(prontuario); // Associar o prontuário ao paciente
//
//                        System.out.println("Paciente " + paciente.getNome() + " cadastrado com sucesso!");
//                        return paciente;
//
//
//                        if (paciente == null) {
//                            System.out.println("Cadastro de paciente cancelado ou inválido.");
//                            return;
//                        }
//
//                        int opcaoPaciente;
//                        do {
//                            System.out.println("\nPaciente: " + paciente.getNome());
//                            System.out.println("1. Abrir uma Ocorrência");
//                            System.out.println("2. Agendar Nova Consulta");
//                            System.out.println("3. Reagendar Consulta (simulado)");
//                            System.out.println("4. Visualizar meu Prontuário (simulado)");
//                            System.out.println("0. Voltar ao Menu Principal");
//                            System.out.print("Sua opção: ");
//
//                            try {
//                                opcaoPaciente = scanner.nextInt();
//                                scanner.nextLine(); // Consumir a nova linha
//
//                                switch (opcaoPaciente) {
//                                    case 1:
//                                        System.out.print("Assunto da ocorrência: ");
//                                        String assuntoOcorrencia = scanner.nextLine();
//                                        System.out.print("Texto da ocorrência: ");
//                                        String textoOcorrencia = scanner.nextLine();
//                                        paciente.abreOcorrencia(assuntoOcorrencia, textoOcorrencia);
//                                        System.out.println("Ocorrência registrada com sucesso!");
//                                        break;
//                                    case 2:
//                                        // Simulação de agendamento
//                                        System.out.println("--- Agendar Nova Consulta ---");
//                                        System.out.print("Digite a data e hora da consulta (DD/MM/YYYY HH:MM): ");
//                                        String dataHoraStr = scanner.nextLine();
//                                        LocalDateTime dataHoraConsulta = null;
//                                        try {
//                                            dataHoraConsulta = LocalDateTime.parse(dataHoraStr, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
//                                            // Tratamento é simplificado aqui
//                                            Tratamento tratamento = new Tratamento(1, "Consulta Geral");
//                                            paciente.novaConsulta(LocalDate.from(dataHoraConsulta), tratamento); // O método espera LocalDate, ajustando
//                                            System.out.println("Consulta agendada com sucesso para " + dataHoraConsulta.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "!");
//                                        } catch (DateTimeParseException e) {
//                                            System.out.println("Erro: Formato de data e hora inválido. Use DD/MM/YYYY HH:MM.");
//                                        }
//                                        break;
//                                    case 3:
//                                        // Simulação de reagendamento
//                                        System.out.println("--- Reagendar Consulta ---");
//                                        System.out.println("Essa funcionalidade é uma simulação. Para reagendar, você precisaria selecionar uma consulta existente.");
//                                        System.out.print("Digite a nova data e hora para a consulta (DD/MM/YYYY HH:MM): ");
//                                        String novaDataHoraStr = scanner.nextLine();
//                                        LocalDateTime novaDataHoraConsulta = null;
//                                        try {
//                                            novaDataHoraConsulta = LocalDateTime.parse(novaDataHoraStr, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
//                                            // Criando uma consulta dummy para o reagendamento simulado
//                                            Consulta consultaSimulada = new Consulta();
//                                            consultaSimulada.setCodigo(999);
//                                            paciente.reagendamentoConsulta(consultaSimulada, novaDataHoraConsulta);
//                                            System.out.println("Consulta reagendada simuladamente para " + novaDataHoraConsulta.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "!");
//                                        } catch (DateTimeParseException e) {
//                                            System.out.println("Erro: Formato de data e hora inválido. Use DD/MM/YYYY HH:MM.");
//                                        }
//                                        break;
//                                    case 4:
//                                        System.out.println("--- Seu Prontuário ---");
//                                        if (paciente.getProntuario() != null) {
//                                            System.out.println("Anotações: " + paciente.getProntuario().getAnotacoes());
//                                            if (!paciente.getProntuario().getExames().isEmpty()) {
//                                                System.out.println("Exames:");
//                                                for (Exame exame : paciente.getProntuario().getExames()) {
//                                                    System.out.println("  - Código: " + exame.getCodigo() + ", Nome: " + exame.getNome() + ", Observações: " + exame.getObservacoes());
//                                                }
//                                            } else {
//                                                System.out.println("Nenhum exame registrado.");
//                                            }
//                                        } else {
//                                            System.out.println("Seu prontuário ainda não foi criado ou está vazio.");
//                                        }
//                                        break;
//                                    case 0:
//                                        System.out.println("Voltando ao Menu Principal...");
//                                        break;
//                                    default:
//                                        System.out.println("Opção inválida. Por favor, escolha novamente.");
//                                }
//                            } catch (InputMismatchException e) {
//                                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
//                                scanner.nextLine(); // Consumir a entrada inválida
//                                opcaoPaciente = -1;
//                            }
//                        } while (opcaoPaciente != 0);
                        break;

                    // MÉDICO:
                    case 2:
//                        menuMedico(scanner);
                        System.out.println("médico 2 foi cadastrado com sucesso!");
                        break;
                    case 0:
                        System.out.println("Obrigado por usar o Sistema VitalLink Tecnologia!");
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
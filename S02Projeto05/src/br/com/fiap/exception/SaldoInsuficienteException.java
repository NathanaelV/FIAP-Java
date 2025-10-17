package br.com.fiap.exception;

// Exception: Exceções verificadas
// RuntimeException: Exceções não verificadas
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

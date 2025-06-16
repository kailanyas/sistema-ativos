package broker;
import broker.model.Ativo;
import broker.repository.AtivoRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        AtivoRepository repository = new AtivoRepository();


        // Exemplo de uso do metodo isPresent()
        Optional<Ativo> ativoOpt1 = repository.findByCodigo("PETR4");
        if (ativoOpt1.isPresent()) {
            System.out.println("Ativo encontrado: " + ativoOpt1.get().getNome());
        } else {
            System.out.println("Ativo não encontrado.");
        }


        // Exemplo de uso do metodo get()
        Ativo ativo = repository.findByCodigo("VALE3").get();
        System.out.println("Ativo encontrado: " + ativo.getNome());


        // Exemplo de uso do metodo orElse(T other)
        Ativo ativoOrElse = repository.findByCodigo("XPTO").orElse(new Ativo("XPTO", "Ativo Desconhecido", BigDecimal.ZERO, LocalDate.now()));
        System.out.println("Ativo: " + ativoOrElse.getNome());


        // Exemplo de uso do metodo orElseGet(Supplier<? extends T> other)
        Ativo ativoOrElseGet = repository.findByCodigo("XPTO").orElseGet(() -> new Ativo("XPTO", "Ativo Padrão", BigDecimal.ZERO, LocalDate.now()));
        System.out.println("Ativo: " + ativoOrElseGet.getNome());


        // Exemplo de uso do metodo orElseThrow(Supplier<? extends X> exceptionSupplier)
        try {
            Ativo ativoOrElseThrow = repository.findByCodigo("XPTO").orElseThrow(() -> new NoSuchElementException("Ativo não encontrado!"));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }


        // Exemplo de uso do metodo ifPresent(Consumer<? super T> action)
        repository.findByCodigo("WEGE3").ifPresent(a -> System.out.println("Ativo encontrado: " + a.getNome()));
    }
}

package broker.repository;
import broker.model.Ativo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AtivoRepository {
    private List<Ativo> ativos = new ArrayList<>();


    public AtivoRepository() {
        ativos.add(new Ativo("PETR4", "Petrobras PN", new BigDecimal("28.50"), LocalDate.now()));
        ativos.add(new Ativo("VALE3", "Vale ON", new BigDecimal("97.00"), LocalDate.now()));
        ativos.add(new Ativo("ITUB4", "Itaú Unibanco PN", new BigDecimal("25.70"), LocalDate.now()));
        ativos.add(new Ativo("BBDC4", "Bradesco PN", new BigDecimal("20.85"), LocalDate.now()));
        ativos.add(new Ativo("ABEV3", "Ambev ON", new BigDecimal("14.32"), LocalDate.now()));
        ativos.add(new Ativo("BBAS3", "Banco do Brasil ON", new BigDecimal("40.50"), LocalDate.now()));
        ativos.add(new Ativo("B3SA3", "B3 ON", new BigDecimal("12.40"), LocalDate.now()));
        ativos.add(new Ativo("BRFS3", "BRF S.A. ON", new BigDecimal("22.85"), LocalDate.now()));
        ativos.add(new Ativo("CIEL3", "Cielo ON", new BigDecimal("3.67"), LocalDate.now()));
        ativos.add(new Ativo("ELET3", "Eletrobras ON", new BigDecimal("42.70"), LocalDate.now()));
        ativos.add(new Ativo("GGBR4", "Gerdau PN", new BigDecimal("26.45"), LocalDate.now()));
        ativos.add(new Ativo("RENT3", "Localiza ON", new BigDecimal("62.90"), LocalDate.now()));
        ativos.add(new Ativo("LREN3", "Lojas Renner ON", new BigDecimal("22.00"), LocalDate.now()));
        ativos.add(new Ativo("MGLU3", "Magazine Luiza ON", new BigDecimal("3.95"), LocalDate.now()));
        ativos.add(new Ativo("RAIL3", "Rumo ON", new BigDecimal("19.50"), LocalDate.now()));
        ativos.add(new Ativo("SUZB3", "Suzano ON", new BigDecimal("45.30"), LocalDate.now()));
        ativos.add(new Ativo("VVAR3", "Via Varejo ON", new BigDecimal("2.25"), LocalDate.now()));
        ativos.add(new Ativo("YDUQ3", "Yduqs ON", new BigDecimal("17.80"), LocalDate.now()));
        ativos.add(new Ativo("WEGE3", "Weg ON", new BigDecimal("40.00"), LocalDate.now()));
        ativos.add(new Ativo("USIM5", "Usiminas PNA", new BigDecimal("8.75"), LocalDate.now()));
    }

    public Optional<Ativo> findByCodigo(String codigo) {
        for (Ativo ativo : ativos) {
            if (ativo.getCodigo().equals(codigo)) {
                return Optional.of(ativo);
            }
        }
        return Optional.empty();
    }
}

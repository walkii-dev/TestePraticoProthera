import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //inserindo as informações de funcionarios na lista
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(new Funcionario("Maria", LocalDate.parse("18-10-2000"), BigDecimal.valueOf(2009.44), "Operador"));
        listaFuncionarios.add(new Funcionario("Joao", LocalDate.parse("12-05-1990"), BigDecimal.valueOf(2284.38), "Operador"));
        listaFuncionarios.add(new Funcionario("Caio", LocalDate.parse("02-05-1961"), BigDecimal.valueOf(9836.14), "Coordenador"));
        listaFuncionarios.add(new Funcionario("Miguel", LocalDate.parse("14-10-1988"), BigDecimal.valueOf(19119.88), "Diretor"));
        listaFuncionarios.add(new Funcionario("Alice", LocalDate.parse("05-01-1995"), BigDecimal.valueOf(2234.68), "Recepcionista"));
        listaFuncionarios.add(new Funcionario("Heitor", LocalDate.parse("19-11-1999"), BigDecimal.valueOf(1582.72), "Operador"));
        listaFuncionarios.add(new Funcionario("Arthur", LocalDate.parse("31-03-1993"), BigDecimal.valueOf(4071.84), "Contador"));
        listaFuncionarios.add(new Funcionario("Laura", LocalDate.parse("08-07-1994"), BigDecimal.valueOf(3017.45), "Gerente"));
        listaFuncionarios.add(new Funcionario("Heloisa", LocalDate.parse("24-05-2003"), BigDecimal.valueOf(1606.85), "Eletricista"));
        listaFuncionarios.add(new Funcionario("Helena", LocalDate.parse("02-09-1996"), BigDecimal.valueOf(2799.83), "Gerente"));

        //remove o funcionario 'joao'
        listaFuncionarios.removeIf(f -> f.getNome().equals("Joao"));
    }
}

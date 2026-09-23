import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {

        //inserindo as informações de funcionarios na lista
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(new Funcionario("Maria", "18-10-2000", 2009.44, "Operador"));
        listaFuncionarios.add(new Funcionario("Joao", "12-05-1990", 2284.38, "Operador"));
        listaFuncionarios.add(new Funcionario("Caio", "02-05-1961", 9836.14, "Coordenador"));
        listaFuncionarios.add(new Funcionario("Miguel", "14-10-1988", 19119.88, "Diretor"));
        listaFuncionarios.add(new Funcionario("Alice", "05-01-1995", 2234.68, "Recepcionista"));
        listaFuncionarios.add(new Funcionario("Heitor", "19-11-1999",1582.72, "Operador"));
        listaFuncionarios.add(new Funcionario("Arthur", "31-03-1993", 4071.84, "Contador"));
        listaFuncionarios.add(new Funcionario("Laura", "08-07-1994", 3017.45, "Gerente"));
        listaFuncionarios.add(new Funcionario("Heloisa", "24-05-2003", 1606.85, "Eletricista"));
        listaFuncionarios.add(new Funcionario("Helena", "02-09-1996", 2799.83, "Gerente"));

        //remove o funcionario 'joao'
        listaFuncionarios.removeIf(f -> f.getNome().equals("Joao"));

        //imprimindo os funcionarios seguindo as diretrizes do projeto( implementação no metodo 'toString()' de Funcionario
        listaFuncionarios.forEach(System.out::println);

        //aumento de 10% no salario de todos
        listaFuncionarios.forEach(f -> f.setSalario(
                f.getSalario().add(f.getSalario().multiply(new BigDecimal("0.1")))));

        System.out.println("Lista de Funcionários pós-reajuste:");
        listaFuncionarios.forEach(System.out::println);

        //agrupando funcionarios por função
        Map<String,List<Funcionario>> funcionariosPorFuncao = listaFuncionarios
                .stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));

        // imprimindo lista de funcionarios agrupados
        System.out.println(funcionariosPorFuncao);

        // imprimindo funcionarios que facam aniversario no mes 10 e 12.
        listaFuncionarios.stream()
                .distinct()
                .filter(f ->
                        f.getDataNascimento().getMonthValue() == 10 ||
                        f.getDataNascimento().getMonthValue() == 12)
                .forEach(System.out::println);

        // imprimindo o funcionario mais velho
        Optional<Funcionario> funcionarioMaisVelho = listaFuncionarios
                .stream().min(Comparator.comparing(Pessoa::getDataNascimento));
        int idade = LocalDate.now().compareTo(funcionarioMaisVelho.get().getDataNascimento());

        System.out.println("o funcionario(a) mais velho(a) é o(a) "+
                funcionarioMaisVelho.get().getNome()+", com "+idade+" anos.");
    }
}

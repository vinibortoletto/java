package dates;

import java.time.Duration;
import java.time.LocalDateTime;

public class IdadeEmDias {
  public long calcularIdadeEmDias(String nascimento) {
    LocalDateTime hoje = LocalDateTime.now();
    LocalDateTime diaNascimento = LocalDateTime.parse(nascimento);

    Duration duracao = Duration.between(diaNascimento, hoje);
    long quantidadeDias = duracao.toDays();

    return quantidadeDias;
  }

  public static void main(String[] args) {
    IdadeEmDias idade = new IdadeEmDias();
    System.out.println("idade:" + idade.calcularIdadeEmDias("1993-08-19T12:45:00"));
  }
}

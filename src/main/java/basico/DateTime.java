package basico;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    static void imprimir() {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt.getDayOfMonth());

        System.out.printf("%s", ld);
        System.out.printf("\n%s", lt);
        System.out.printf("\n%s", ldt);

        // Converter Date
        Date dt = new Date();
        Instant i = dt.toInstant();
        LocalDateTime nldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
        System.out.println("\n-> " + nldt);

        // Converter Calendar
        Calendar c = Calendar.getInstance();
        Instant i2 = c.toInstant();
        LocalDateTime nldt2 = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
        System.out.println("-> " + nldt2);

        // Converter localdatetime para date, e date para calendar
        Instant i3 = ldt.toInstant(ZoneOffset.UTC);
        System.out.println("-> " + i3);
        Date dt2 = Date.from(i3);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(dt2);

        // Somar segs
        Instant i4 = Instant.now();
        Duration adicionar = Duration.ofSeconds(-10);
        System.err.println("\n" + i4);
        i4 = i4.plus(adicionar);
        System.err.println(i4);

        // Diferença
        Instant m1 = Instant.EPOCH; // Data inicial
        Instant m2 = Instant.now();
        long segs = Duration.between(m1, m2).getSeconds();
        System.err.println(segs);
        long minutos = segs / 60;
        long horas = minutos / 60;
        long dias = horas / 24;
        long anos = dias / 365;
        System.err.println("\nMinutos: " + minutos);
        System.err.println("Horas: " + horas);
        System.err.println("Dias: " + dias);
        System.err.println("Anos: " + anos);

        LocalDate aniversario = LocalDate.of(1989, 03, 23);
        LocalDate hoje = LocalDate.now();

        System.out.println("\nAnos: " + ChronoUnit.YEARS.between(aniversario, hoje));
        System.out.println("Meses: " + ChronoUnit.MONTHS.between(aniversario, hoje));
        System.out.println("Dias: " + ChronoUnit.DAYS.between(aniversario, hoje));

        Period tempoDeVida = Period.between(aniversario, hoje);
        System.out.println("\nAnos Corridos: " + tempoDeVida.getYears());
        System.out.println("Meses Corridos: " + tempoDeVida.getMonths());
        System.out.println("Dias Corridos: " + tempoDeVida.getDays());

        // Format localdate para String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("\n" + formatter.format(ldt));
        // ou
        System.out.println(ldt.format(formatter2));

        // String para localdate
        System.out.println(LocalDate.parse("08/08/08", formatter2));
    }

    public static void main(String[] args) {
        DateTime.imprimir();
    }
}
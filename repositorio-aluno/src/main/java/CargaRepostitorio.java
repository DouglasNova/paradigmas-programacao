import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargaRepostitorio {


    private static final String COMMA_DELIMITER = ";";

    public static List<Aluno> load(){

        List<Aluno> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Alunos.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(new Aluno(values[0],values[1],values[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}

public class SomaAcumulativa {

    public static void main(String[] args) {

        System.out.println(SomaAcumulativa(22));
    }

    //Para fins de acelarar a realização do exercicio não usarei de um scanner para entreda dos dados;
    public static int SomaAcumulativa(int n) {

        if (n == 0) {
            return 0;
        }
        return SomaAcumulativa(n - 1) + n;
    }
}

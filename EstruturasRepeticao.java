package fundamentojava;

public class EstruturasRepeticao {
    static void main() {


        int cout = 1;

        while (cout < 10) {
            System.out.println("Ola mundo" + cout);
            cout++;
        }
        cout = 0;
        do {
            System.out.println("EstruturasRepeticao.main" + cout);
            cout++;
        }while (cout < 4);



        for (int i = 0; i < 10;) {
            System.out.println("Olá mundo" + i);
            i +=1;

        }
    }
}

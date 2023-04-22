package zad3;

public class Main {
    public static void main(String[] args) {

        Drzewo[] las=new Drzewo[5];
        for (int i = 0; i < las.length ; i++) {
            switch ((int) (Math.random() * 6)) {
                case 0:
                    las[i]=new DrzewoIglaste(true,15,"sosna",2,7);
                    break;
                case 1:
                    las[i]=new DrzewoIglaste(false,15,"modrzew",2,7);
                    break;
                case 2:
                    las[i]=new DrzewoLisciaste(false,15,"dab","okragly");
                    break;
                case 3:
                    las[i]=new DrzewoLisciaste(false,15,"osik","kwadratowe");
                    break;
                case 4:
                    las[i]=new DrzewoOwocowe(false,15,"morelowiec","dawdawd","moreala");
                    break;
                case 5:
                    las[i]=new DrzewoOwocowe(false,15,"sliwa","awdawd","sliwa");
                    break;
            }
        }

        for (int i = 0; i <las.length ; i++) {
            System.out.println(las[i]);
        }
        for (int i = 0; i <las.length ; i++) {
            try {
                las[i].zerwijOwoc();

            } catch (DrzewoBezOwocoweException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

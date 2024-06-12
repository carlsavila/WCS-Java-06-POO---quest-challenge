import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {

        Wilder student01 = new Wilder("Jean-Claude");
        Wilder student02 = new Wilder("Henri", true);

        System.out.println(student01.whoAmI());
        System.out.println(student02.whoAmI());

        System.out.println("L'étudiant "
                + student01.getFirstname()
                + (student01.getAware() ? " est informé!" : " n'est pas informé!"));
        System.out.println("L'étudiant "
                + student02.getFirstname()
                + (student02.getAware() ? " est informé!" : " n'est pas informé!"));

        ArrayList<Wilder> students = new ArrayList<>();
        students.add(student01);
        students.add(student02);

        students.add(new Wilder("Philippe"));
        students.add(new Wilder("Cyrille", true));

        for (Wilder wilder : students) {
            System.out.println("L'étudiant "
                    + wilder.getFirstname()
                    + (wilder.getAware() ? " est au courant !" : " n'est pas informé!"));

                    if (wilder.getAware()) wilder.setAware(false); else wilder.setAware(true);

                    System.out.println("\tmais il "
                    + (wilder.getAware() ? " est maintenant !" : " ne l'est plus maintenant !"));
                }
    }
}

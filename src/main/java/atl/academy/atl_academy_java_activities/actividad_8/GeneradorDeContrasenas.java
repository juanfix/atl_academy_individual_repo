package atl.academy.atl_academy_java_activities.actividad_8;

public class GeneradorDeContrasenas {
    public static void main(String[] args) {
        System.out.println("Password: " + generatePassword());
    }

    public static String generatePassword () {
        String secretWord = "SeCrE_Vlas;";
        return secretWord += (int)(Math.random()*100000+1);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis =  """
                The Matrix es una película donde la humanidad está atrapada en una realidad simulada
                creada por máquinas. Neo, un hacker, descubre la verdad y se une a una rebelión para 
                liberar a la humanidad. ¿Podrá despertar a todos?. Fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

        // lo que hice ayer y hoy o sea esto:v 

    }
}
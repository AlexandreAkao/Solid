package SRP;

class Main {
    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("Eu tomei café hoje");
        j.addEntry("Eu faltei semana passada");
        System.out.println(j);
    }
}
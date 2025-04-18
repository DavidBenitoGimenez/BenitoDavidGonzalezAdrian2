package prog2.vista;

import prog2.model.Camping;
import java.util.Scanner;

public class VistaCamping {
    private enum OpcionesMenu {
        LLISTAR_ALLOTJAMENTS,
        LLISTAR_ALLOTJAMENTS_OPERATIUS,
        LLISTAR_ALLOTJAMENTS_NO_OPERATIUS,
        LLISTAR_ACCESSOS_OBERTS,
        LLISTAR_ACCESSOS_TANCATS,
        LLISTAR_INCIDENCIES,
        AFEGIR_INCIDENCIA,
        ELIMINAR_INCIDENCIA,
        CALCULAR_ACCESSOS_COTXE,
        CALCULAR_METRES_ASFALT,
        GUARDAR_CAMPING,
        RECUPERAR_CAMPING,
        SORTIR
    }

    private String nomCamping;
    private Camping camping;
    private Menu<OpcionesMenu> menuPrincipal;
    private Scanner scanner;

    /**
     * Constructor de la classe VistaCamping
     * @param nomCamping Nom del càmping
     */
    public VistaCamping(String nomCamping) {
        this.nomCamping = nomCamping;
        this.camping = new Camping("Green");
        this.camping.inicialitzaDadesCamping();
        this.scanner = new Scanner(System.in);

        // Configurar el menú
        String[] descripcions = {
                "Llistar tots els allotjaments",
                "Llistar allotjaments operatius",
                "Llistar allotjaments no operatius",
                "Llistar accessos oberts",
                "Llistar accessos tancats",
                "Llistar incidències actuals",
                "Afegir una incidència",
                "Eliminar una incidència",
                "Calcular accessos amb cotxe",
                "Calcular metres d'asfalt",
                "Guardar dades del càmping",
                "Recuperar dades del càmping",
                "Sortir de l'aplicació"
        };

        this.menuPrincipal = new Menu<>("Menú Principal", OpcionesMenu.values());
        this.menuPrincipal.setDescripcions(descripcions);
    }

    /**
     * Obté el nom del càmping
     * @return Nom del càmping
     */
    public String getNomCamping() {
        return nomCamping;
    }

    /**
     * Estableix el nom del càmping
     * @param nomCamping Nou nom del càmping
     */
    public void setNomCamping(String nomCamping) {
        this.nomCamping = nomCamping;
    }

    /**
     * Gestiona el menú principal del càmping
     */
    public void gestioCamping() {
        OpcionesMenu opcio;
        do {
            menuPrincipal.mostrarMenu();
            opcio = menuPrincipal.getOpcio(scanner);
            procesarOpcio(opcio);
        } while (opcio != OpcionesMenu.SORTIR);
    }

    /**
     * Processa l'opció seleccionada del menú
     * @param opcio Opció seleccionada
     */
    private void procesarOpcio(OpcionesMenu opcio) {
        try {
            switch (opcio) {
                case LLISTAR_ALLOTJAMENTS:
                    System.out.println(camping.llistarAllotjaments());
                    break;

                case LLISTAR_ALLOTJAMENTS_OPERATIUS:
                    System.out.println(camping.llistarAllotjaments("Obert"));
                    break;

                case LLISTAR_ALLOTJAMENTS_NO_OPERATIUS:
                    System.out.println(camping.llistarAllotjaments("Tancat"));
                    break;

                case LLISTAR_ACCESSOS_OBERTS:
                    System.out.println("Els accessos oberts són: ");
                    System.out.println(camping.llistarAccesosOberts());
                    break;

                case LLISTAR_ACCESSOS_TANCATS:
                    System.out.println("Els accessos tancats són: ");
                    System.out.println(camping.llistarAccesosTancats());
                    break;

                case LLISTAR_INCIDENCIES:
                    System.out.println("Les incidències actuals són: ");
                    System.out.println(camping.llistarIncidencies());
                    break;

                case AFEGIR_INCIDENCIA:
                    afegirIncidencia();
                    break;

                case ELIMINAR_INCIDENCIA:
                    eliminarIncidencia();
                    break;

                case CALCULAR_ACCESSOS_COTXE:
                    System.out.println("Accessos amb cotxe: " + camping.calculaAccessosAccessibles());
                    break;

                case CALCULAR_METRES_ASFALT:
                    System.out.println("Metres d'asfalt: " + camping.calculaMetresQuadratsAsfalt());
                    break;

                case GUARDAR_CAMPING:
                    guardarCamping();
                    break;

                case RECUPERAR_CAMPING:
                    recuperarCamping();
                    break;

                case SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }
        } catch (ExcepcioCamping e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperat: " + e.getMessage());
        }
    }

    /**
     * Afegeix una nova incidència
     * @throws ExcepcioCamping Si hi ha un error en afegir la incidència
     */
    private void afegirIncidencia() throws ExcepcioCamping {
        System.out.print("Número d'incidència: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // Netejar buffer

        System.out.print("Tipus d'incidència (Reparacio/Neteja/Tancament): ");
        String tipus = scanner.nextLine();

        System.out.print("ID de l'allotjament: ");
        String idAllotjament = scanner.nextLine();

        System.out.print("Data de la incidència: ");
        String data = scanner.nextLine();

        camping.afegirIncidencia(num, tipus, idAllotjament, data);
        System.out.println("Incidència afegida correctament.");
    }

    /**
     * Elimina una incidència existent
     * @throws ExcepcioCamping Si hi ha un error en eliminar la incidència
     */
    private void eliminarIncidencia() throws ExcepcioCamping {
        System.out.println(camping.llistarIncidencies());
        System.out.print("Número d'incidència a eliminar: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // Netejar buffer

        camping.eliminarIncidencia(num);
        System.out.println("Incidència eliminada correctament.");
    }

    /**
     * Guarda l'estat del càmping en un fitxer
     * @throws ExcepcioCamping Si hi ha un error en guardar el càmping
     */
    private void guardarCamping() throws ExcepcioCamping {
        System.out.print("Introdueix el nom del fitxer per guardar: ");
        String fitxerGuardar = scanner.nextLine();
        camping.save(fitxerGuardar);
        System.out.println("Camping guardat correctament.");
    }

    /**
     * Recupera l'estat del càmping des d'un fitxer
     * @throws ExcepcioCamping Si hi ha un error en carregar el càmping
     */
    private void recuperarCamping() throws ExcepcioCamping {
        System.out.print("Introdueix el nom del fitxer per carregar: ");
        String fitxerCarregar = scanner.nextLine();
        camping = Camping.load(fitxerCarregar);
        System.out.println("Camping carregat correctament.");
    }
}
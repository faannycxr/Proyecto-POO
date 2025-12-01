import javax.swing.*; //para JFrame, Jlabel, ImageIcon,
public class Rob {
//primera version Rob, prueba para interfaz visual del proyecto
public static void main(String[] args) {
        JFrame ventana = new JFrame("Rob Asistente"); //Crea la ventana 
        ventana.setSize(400, 400); //medidas(alto, ancho)
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        ImageIcon iconoRob = new ImageIcon("rob.png"); //cargar a ROB desde la carpeta

        // Obtener ancho y alto real de la imagen
        int ancho = iconoRob.getIconWidth();
        int alto = iconoRob.getIconHeight();

        // Crear el JLabel con su tamaño original
        JLabel labelImagen = new JLabel(iconoRob);//mostrar imegen
        labelImagen.setBounds(20, 20, ancho, alto);//ajuste de dimensiones
        ventana.add(labelImagen); 

        //Para que ROB hable
        JLabel textoRob = new JLabel("Hola, soy Rob. ¿En qué puedo ayudarte?");
        textoRob.setBounds(20, alto + 40, 350, 30); //posicion de texto
        ventana.add(textoRob);//añadir texto a ventana

        ventana.setVisible(true);//ventana visible en pantalla 
    }
}

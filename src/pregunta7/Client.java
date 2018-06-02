package pregunta7;

public class Client {

    public static void main(String[] args) {
        ContainerIOC container = new ContainerIOC();
        DeviceOutput deviceOutput = container.getInstance("Screen");
        deviceOutput.write("Text to screen");
        
        container.getInstance("Printer").write("Text to printer");        
    }
}

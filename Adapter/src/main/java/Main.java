import org.example.*;
import org.example.adapter.HdmiVgaAdapterComposition;
import org.example.adapter.HdmiVgaAdapterHeritage;

public class Main {
    public static void main(String[] args) {
        UniteCentre uniteCentre=new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");
        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour");

        HdmiVgaAdapterComposition hdmiVgaAdapter=new HdmiVgaAdapterComposition();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir GLSID Design Pattern");

        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("Hello");

        HdmiVgaAdapterComposition hdmiVgaAdapter1=new HdmiVgaAdapterComposition();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("Bonsoir");

        HdmiVgaAdapterHeritage hdmiVgaAdapterHeritage=new HdmiVgaAdapterHeritage();
        uniteCentre.setVga(hdmiVgaAdapterHeritage);
        hdmiVgaAdapterHeritage.print("Test par heritage");
    }
}
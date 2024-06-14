package equipamentos.multfuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    
    public void copiando(){
        System.out.println("Copiando fia equipamento mulfuncional");
    }

    public void digitalizar(){
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void imprimir(){
        System.out.println("imprimindo via equipamento mulfuncional");
    }
}

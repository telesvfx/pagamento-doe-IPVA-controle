import javax.swing.JOptionPane;

public class ThiagoTelesSilva_Ag6_DS_I2 {
    public static void main(String[] args) {


        String nome;
        int placa;

        
        nome = JOptionPane.showInputDialog("Por favor, informe o seu nome:");
 
    

        
        String inputPlaca = JOptionPane.showInputDialog("Sr. ou Sr.ª " + nome + ", digite o número final da placa de seu veículo:");
        placa = Integer.parseInt(inputPlaca);

      
        switch (placa) {
            case 1:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 30/04");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 31/05");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 30/06");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 31/07");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 31/08");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 30/09");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 31/10");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 30/11");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 31/12");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, nome + ", o pagamento do IPVA do seu veículo deve ser realizado até o dia 31/12");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Valor digitado está incorreto. Por favor, verifique e tente novamente. O número só pode conter um dígito!");
                break;
        }
    }
}
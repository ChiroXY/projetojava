import javax.swing.JOptionPane;

public class Assistir {
    public static void main(String[] orgs) throws Exception {
        String[] opcoes = new String[] {
        "Anime HunterXHunter",
        "Anime One piece",
        "Anime Haikyuu",
        "Anime Jojo",
        "Sair"
       };
    
    int opcaoEscolhida = 0;
    
    while(opcaoEscolhida != 4) {
        opcaoEscolhida = JOptionPane.showOptionDialog(
            null,
            "O que você deseja assistir?",
            "DevFlix",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            0
        );

        if (opcaoEscolhida != 4) {
            String mensagem = "Você assistiu "  + opcoes[opcaoEscolhida];
            JOptionPane.showMessageDialog(null, mensagem);
        }

        System.out.println("Opção escolhida" + opcaoEscolhida);

        
    }
    
    }
    
        
    }

package Chamada;

import javax.swing.JOptionPane;


public class ChamadaTest {
    // método main inicia a execução
    public static void main(String[] args) {
       
       
        String nomeCurso = JOptionPane.showInputDialog("Nome para criar o curso? ");

        Chamada minhaChamada = new Chamada(nomeCurso);
        
        JOptionPane.showMessageDialog(null, "Nome inicial do curso e " + minhaChamada.getNomeCurso());
        
        nomeCurso = JOptionPane.showInputDialog("Altere o nome do curso: ");
        minhaChamada.setNomeCurso(nomeCurso); 
        
        String nomeProf = JOptionPane.showInputDialog("Qual o nome do professor? ");
        minhaChamada.setNomeProf(nomeProf);
        
        JOptionPane.showMessageDialog(null, minhaChamada.boasVindas());
        JOptionPane.showMessageDialog(null, minhaChamada.profCurso());
        
    } 
} 
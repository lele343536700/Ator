/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ator;

/**
 *
 * @author Administrador
 */
import dao.AtorDao;
import javax.swing.JOptionPane;
import modelo.Ator;
import tela.manutencao.ManutencaoAtor;
public class Ator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    public static void inserir(ManutencaoAtor man){
        Ator objeto = new Ator();
        objeto.setNome_(man.jtfNomeArtistico.getText());
        objeto.setNome(man.jtfNome.getText());
        
        boolean resultado = PaisDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
} // TODO code application logic here
    }
    
}

package Telas;

import Classes.Ranking;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SortOrder;
import javax.swing.RowSorter.SortKey;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

class TelaRanking_Dificil extends JFrame {
    private JPanel jpn = new JPanel();
    private JTable table = new JTable();
    private JButton bVoltar = new JButton("VOLTAR");
    private JLabel lblPontos = new JLabel("PONTOS");
    private JLabel lblAvatar = new JLabel("AVATAR");
    public DefaultTableModel modelo;
    private TableRowSorter tableSorter;

    public TelaRanking_Dificil() {
        super("Jenius - A melhor versão");
        this.jpn.setBackground(new Color(50, 79, 79));
        this.bVoltar.setBackground(new Color(255, 215, 0));
        this.bVoltar.setForeground(Color.BLACK);
        this.jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.lblAvatar.setBounds(272, 79, 70, 14);
        this.table.setBounds(234, 104, 273, 256);
        this.lblPontos.setBounds(405, 79, 70, 14);
        this.bVoltar.setBounds(10, 48, 100, 37);
        this.lblAvatar.setFont(new Font("Tahoma", 3, 15));
        this.lblPontos.setFont(new Font("Tahoma", 3, 15));
        this.jpn.add(this.lblAvatar);
        this.jpn.add(this.lblPontos);
        this.jpn.add(this.bVoltar);
        this.jpn.add(this.table);
        this.setContentPane(this.jpn);
        this.jpn.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(3);
        this.setSize(640, 480);
        Ranking R = new Ranking();
        this.modelo = (DefaultTableModel)this.table.getModel();
        this.modelo.setNumRows(0);
        this.modelo.addColumn("Avatar");
        this.modelo.addColumn("Pontos");
        this.tableSorter = new TableRowSorter(this.modelo);
        this.table.setRowSorter(this.tableSorter);
        List<SortKey> sortKeys = new ArrayList();
        sortKeys.add(new SortKey(1, SortOrder.DESCENDING));
        this.tableSorter.setSortKeys(sortKeys);
        List<Ranking> lista_ranking = R.Ler();
        Object[] dados = new Object[2];

        for(int i = 0; i < lista_ranking.size(); ++i) {
            if (((Ranking)lista_ranking.get(i)).getDificuldade().getNome().equals("Difícil")) {
                dados[0] = ((Ranking)lista_ranking.get(i)).getJogo().getNomeUsuario();
                dados[1] = ((Ranking)lista_ranking.get(i)).getJogo().getPontos();
                this.modelo.addRow(dados);
            }
        }

        this.bVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRanking_Dificil.this.dispose();
                TelaRankingLixo p = new TelaRankingLixo();
                p.setDefaultCloseOperation(3);
                p.setSize(640, 480);
                p.setResizable(false);
                p.setVisible(true);
            }
        });
        this.bVoltar.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaRanking_Dificil.this.bVoltar.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaRanking_Dificil.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaRanking_Dificil.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaRanking_Dificil.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaRanking_Dificil.this.bVoltar.setBackground(Color.YELLOW);
            }
        });
    }
}

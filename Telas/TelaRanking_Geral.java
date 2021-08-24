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
import java.util.Iterator;
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

public class TelaRanking_Geral extends JFrame {
    private JPanel jpn = new JPanel();
    private JButton bVoltar = new JButton("VOLTAR");
    private JLabel lblAvatar = new JLabel("AVATAR");
    private JLabel lblPontos = new JLabel("PONTOS");
    private JLabel lblNivel = new JLabel("NIVEL");
    public DefaultTableModel modelo;
    private JTable table = new JTable();
    private TableRowSorter tableSorter;

    public TelaRanking_Geral() {
        super("Xenius - A melhor versão");
        this.jpn.setBackground(new Color(47, 79, 79));
        this.bVoltar.setBackground(new Color(255, 215, 0));
        this.bVoltar.setForeground(Color.BLACK);
        this.jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.lblAvatar.setBounds(151, 95, 80, 14);
        this.lblPontos.setBounds(271, 95, 73, 14);
        this.lblNivel.setBounds(412, 95, 57, 14);
        this.bVoltar.setBounds(10, 48, 100, 37);
        this.table.setBounds(132, 120, 361, 226);
        this.lblAvatar.setFont(new Font("Tahoma", 3, 15));
        this.lblPontos.setFont(new Font("Tahoma", 3, 15));
        this.lblNivel.setFont(new Font("Tahoma", 3, 15));
        this.setContentPane(this.jpn);
        this.jpn.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(3);
        this.setSize(640, 480);
        this.jpn.add(this.lblAvatar);
        this.jpn.add(this.lblPontos);
        this.jpn.add(this.lblNivel);
        this.jpn.add(this.bVoltar);
        this.jpn.add(this.table);
        Ranking R = new Ranking();
        this.modelo = (DefaultTableModel)this.table.getModel();
        this.modelo.setNumRows(0);
        this.modelo.addColumn("Avatar");
        this.modelo.addColumn("Dificuldade");
        this.modelo.addColumn("Pontos");
        this.tableSorter = new TableRowSorter(this.modelo);
        this.table.setRowSorter(this.tableSorter);
        List<SortKey> sortKeys = new ArrayList();
        sortKeys.add(new SortKey(1, SortOrder.DESCENDING));
        this.tableSorter.setSortKeys(sortKeys);
        Iterator var4 = R.Ler().iterator();

        while(var4.hasNext()) {
            Ranking rk = (Ranking)var4.next();
            this.modelo.addRow(new Object[]{rk.getJogo().getNomeUsuario(), rk.getJogo().getPontos(), rk.getDificuldade().getNome()});
        }

        this.bVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRanking_Geral.this.dispose();
                TelaRankingLixo p = new TelaRankingLixo();
                p.setDefaultCloseOperation(3);
                p.setSize(640, 480);
                p.setResizable(false);
                p.setVisible(true);
            }
        });
        this.bVoltar.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaRanking_Geral.this.bVoltar.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaRanking_Geral.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaRanking_Geral.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaRanking_Geral.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaRanking_Geral.this.bVoltar.setBackground(Color.YELLOW);
            }
        });
    }
}

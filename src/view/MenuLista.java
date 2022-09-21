package view;

import controller.AlunoController;
import model.Aluno;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MenuLista extends JFrame {
    private LayoutManager managerLista;
    private JList listaAtual;
    private AlunoController alunoGenerico = new AlunoController();
    public MenuLista(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        managerLista = new GridLayout(5,4);
        setLayout(managerLista);

        setTitle("Lista de Alunos");

        setVisible(true);

    }

    public MenuLista(int i) throws IOException {
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        managerLista = new GridLayout(2,5);
        setLayout(managerLista);

        setTitle("Lista de Alunos");

        String[] alunosDaLista = alunoGenerico.listaAlunos().split("\n");

        listaAtual = new JList(alunosDaLista);

        add(listaAtual);

        setVisible(true);
    }
}

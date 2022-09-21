package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuPrincipal extends JFrame {
    static MenuAluno menuCad;
    static MenuLista menuLista;
    static MenuLista menu = new MenuLista();

    static LayoutManager managerMenu;

    public static void main(String[] args) {
        try {
        menu.setSize(800,600);
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);

        managerMenu = new GridLayout(1,2);
        menu.setLayout(managerMenu);

        menu.setTitle("Menu Principal");

        JButton btnLista = new JButton("Lista"), btnCadAluno = new JButton("Cadastro Aluno");

        btnLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    menuLista = new MenuLista(1);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        menu.add(btnLista);

        btnCadAluno.addActionListener(actionEvent -> menuCad = new MenuAluno());
        menu.add(btnCadAluno);

        menu.setVisible(true);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

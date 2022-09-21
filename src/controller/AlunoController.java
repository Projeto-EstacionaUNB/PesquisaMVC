package controller;

import model.Aluno;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();

    public AlunoController() {
    }

    public AlunoController(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public boolean guardaAluno(String nomeCompleto, String nomeCurso, int matriculaAluno, String email) throws IOException {
        Aluno x = new Aluno(nomeCompleto, nomeCurso,matriculaAluno,email);
        alunos.add(x);

        if(x == null){
            return false;
        }else{
            FileWriter arq = new FileWriter("leitura.txt",true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(alunos.toString() + " \n");
            arq.close();
            return true;
        }
    }

    public String listaAlunos() throws IOException {
        FileReader lerar = new FileReader("leitura.txt");
        int data = lerar.read();
        String dados = null;
        boolean isFirst = true;
        int i =0;
        List<String> listaPalavras = new ArrayList<>();
        while (data != -1){
            if(isFirst){
                dados = String.valueOf((char)data);
                data = lerar.read();
                isFirst =false;
            }else{
                dados += String.valueOf((char)data);
                data = lerar.read();
            }
        }
        lerar.close();

        dados = dados.toString().replace("[","").replace("]","").replace(",","");
        return dados;
    }

    @Override
    public String toString() {
        return "Lista de Alunos: " + alunos;
    }
}

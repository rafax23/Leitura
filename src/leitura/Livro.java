/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitura;

/**
 *
 * @author Rafael
 -tituto
 -autor
 -totpag
 -pagatual
 -leitor
 + detalhes()
 */

//implementa Publicacao
public class Livro implements Publicacao {
    
    //atributos
    private String titulo;
    private Pessoa autor; //PESSOA
    private int totPag;
    private int pagAtual;
    private Pessoa leitor; //PESSOA
    
    //construtor
    public Livro(String oTitulo, Pessoa oAutor, int oTotPag, int oPagAtual, Pessoa oLeitor){
        setTitulo(oTitulo);
        setAutor(oAutor);
        setTotPag(oTotPag);
        setPagAtual(oPagAtual);
        setLeitor(oLeitor);
    }
    
    //métodos
    public void detalhes(){
        imp("LIVRO: \nTitulo"
            +"\nAutor: "
            +"\nTotal Paginas: "
            +"\nPagina Atual: "
            +"\nLeitor: ");
    }
    
    //Mensagem
    public void imp(String texto){
        System.out.println(texto);
    }
    
    
    
    //implementação métodos abstrados da Interface Controladora Publicação
    @Override
    public void abrir() {
        //CTRL + E deleta linha
    }

    @Override
    public void fechar() {
    }

    @Override
    public void avancar() {
    }

    @Override
    public void voltar() {
    }

    public String getTitulo() {
        return titulo;
    }

    //getters e setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    
    
}

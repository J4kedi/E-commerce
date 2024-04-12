package models;

import java.util.List;

public class Livro extends Produto {
    private String categoria;
    private String autor;
    private String genero;
    private int anoDeLancamento;
// criar lista de livros pra adicionar e exibir depois
    private List<Livro> livros;

    public Livro(String nome, float preco, String descricao, String categoria, String autor, String genero, int anoDeLancamento) {
        super(preco, descricao, nome);
        
        this.categoria = categoria;
        this.autor = autor;
        this.genero = genero;
        this.anoDeLancamento = anoDeLancamento;
    }

// metodo pra adicionar livros a coleção de livros da loja
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

// método pra mostrar o catalogo de livros da loja
    public void mostrarLivros() {
        System.out.println("Catálogo de Livros:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public String toString() {
        return "Nome do Livro: " + getNomeDoProduto() + ", Autor: " + autor + ", Gênero: " + genero + ", Preço: " + getPreco() + ", Ano de Lançamento: " + anoDeLancamento;
    }
}



/**
 * Escreva a descrição da classe Mapa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class TabelaDispersao
{
    public void inserir(int e)
    {
        int pos = dispersao(e);
        container[pos] = e;
    }
    
    public int buscar(int e)
    {
        return container[dispersao(e)];
    }    
    
    public int remover(int e)
    {
        int pos = dispersao(e);
        if( container[pos] == e ){
            container[pos] = 0;
            return e;
        } else {
            return -1;
        }
    }
    
    private int dispersao(int e)
    {
        return e % container.length;
    } 
    
    private static final int TAM_PADRAO = 4;
    private int[] container = new int[TAM_PADRAO];
        
}

// gera lita de numeros que nao se repetem
fun main(args: Array<String>) {
    
    // numero inicial
    var ini = 1
    // numero final
    var fim = 15
    // total de numeros gerados
    var total = 10

    // gera o primeiro
    var listNro = hashSetOf( (ini..fim).shuffled().first() )
    
    // roda ate atingir o total de numeros
    while( listNro.size < total) {
        
        // adiciona o numero gerado
        listNro.add( (ini..fim).shuffled().first() )
        
    }
    
    // mostra lista de numeros gerados
    println( listNro )
    
            
}

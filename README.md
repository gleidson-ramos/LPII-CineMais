# CineMais

## Descrição do cenário
A CineMais possui cinemas em diversos shoppings da cidade. Cada um desses cinemas contém uma ou mais salas de projeção. Nessas salas são exibidos os filmes em diversas sessões diferentes. O cliente do cinema compra os ingressos para assistir a um determinado filme em uma sala e em uma sessão específica.

Cada sala de projeção possui um número e uma capacidade. Existem salas que possibilitam projeção de filmes 3d. Essas salas possuem equipamentos especiais de projeção e de som e óculos 3d para os clientes. Devido a isso é preciso cadastrar também para essas salas a descrição dos equipamentos além de ser cobrado um preço especial pelo ingresso.

Os filmes são cadastrados com titulo, diretor, ator principal, duração, classificação etária e categoria (ação, comédia, infantil, suspense ou terror).

As salas projetam os filmes em diversas sessões. Assim cada sala tem um conjunto de sessões definidas diariamente.

O valor do ingresso é o mesmo para todos os filmes, exceto para as salas 3D, cujo valor é 20% mais caro que as salas comuns. Além disso, O CineMais tem um valor para dias comuns e um valor para finais de semana. Estudantes tem direito a meia entrada em qualquer dia. Só é permitida a venda de ingressos caso exista vaga na sala e na sessão desejada pelo cliente.

## Requisitos
Para o cenário acima, construir uma aplicação em Java que permita:

- Efetuar todos os cadastros (incluir, alterar, excluir e consultar) necessários;
- Definir as sessões e filmes de uma sala;
- Vender ingresso;
- Cancelar venda de ingresso;
- Imprimir ticket (pode ser uma impressão na tela mesmo);
- Consultar filmes em exibição em um determinado dia;
- Verificar se existe vaga disponível em uma sala/sessão em uma data;

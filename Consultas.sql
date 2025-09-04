-- elecione o nome do contato (C: ContactName) e o telefone (C: Phone) de todos os clientes (T: Customers) que moram em Londres.


--1. Listagem Simples: Selecione o nome do contato (C: ContactName) e o telefone (C: Phone) de todos os clientes (T: Customers) que moram em Londres.
SELECT c.ContactName, c.Phone FROM Customers c where c.City = 'London'


--2. Ordena��o: Mostre todos os produtos (T: Products) que est�o com o estoque (C: UnitsInStock) zerado, ordenados pelo nome do produto em ordem alfab�tica (C: ProductName).
select P.ProductName FROM Products P where P.UnitsInStock = 0 ORDER BY P.ProductName ASC

--3. Filtro com Datas: Liste todos os pedidos (T: Orders) que foram feitos no m�s de maio de 1997. Ordene os resultados pela data do pedido (C: OrderDate), do mais recente para o mais antigo.
SELECT * FROM Orders O WHERE CAST(O.OrderDate AS DATE) BETWEEN '1997-05-01' and '1997-05-31'

--4. Uso do TOP: Identifique os 5 produtos mais caros da loja. A consulta deve retornar o nome do produto (C: ProductName) e o seu pre�o (C: UnitPrice).
select TOP 5 P.ProductName,P.UnitPrice FROM Products P ORDER BY P.UnitPrice DESC 

--5. M�ltiplos Crit�rios: Encontre todos os funcion�rios (T: Employees) que foram contratados (C: HireDate) antes do ano de 1993 e que moram nos EUA (C: Country = 'USA').
SELECT * FROM Employees F WHERE F.HireDate < '1993-01-01' AND F.Country = 'USA'

--6. Contagem Simples (COUNT): Quantos produtos ao todo s�o fornecidos pelo fornecedor (T: Supplier) de ID = 1?
SELECT COUNT(*) FROM Products P WHERE P.SupplierID = 1

--7. M�dia de Pre�os (AVG): Qual � o pre�o m�dio de todos os produtos cadastrados na tabela T: Products? D� um nome (alias) para a coluna de resultado como PrecoMedio.
SELECT AVG(P.UnitPrice) AS precoMedio FROM Products P 


--8. Agrupamento (GROUP BY): Crie uma consulta que mostre a quantidade de clientes existentes em cada pa�s (C: Country).
select COUNT(*), E.Country from Customers E GROUP BY E.Country

--9. Soma (SUM) com Agrupamento: Calcule o valor total de itens em estoque (C: UnitsInStock) para cada categoria de produto (C: CategoryID). A consulta deve mostrar o C: CategoryID e a soma total.
SELECT SUM(P.UnitPrice),P.CategoryID FROM Products P GROUP BY P.CategoryID

--10. Filtro de Grupos (HAVING): Liste todos os pa�ses que possuem mais de 7 clientes. A consulta deve mostrar o pa�s e a contagem de clientes.
# TP 5 : Intégration de Spring et Hibernate



## Objectif du TP

Créer une application Java utilisant **Spring** et **Hibernate** pour gérer la persistance des données avec **MySQL**.

---

## Structure du projet
<img width="612" height="850" alt="image" src="https://github.com/user-attachments/assets/d8222e5d-131d-44d5-b699-e7354ff940b5" />


Le projet contient :
- **dao/** : Interface générique `IDao`
- **entities/** : Entité `Product` avec annotations JPA
- **metier/** : Implémentation `ProductDaoImpl`
- **util/** : Configuration Spring/Hibernate `HibernateConfig`

---

## Dépendances Maven (pom.xml)
Les dépendances utilisées :
- `spring-context` - Injection de dépendances
- `spring-orm` - Intégration Hibernate
- `spring-tx` - Gestion des transactions
- `hibernate-core` - ORM
- `mysql-connector-java` - Connexion MySQL

---

##  Configuration de la base de données
Fichier `application.properties` :
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/base
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

---

## Entité Product

![Code Product.java](screenshots/04-entity-product.png)

L'entité `Product` utilise les annotations JPA :
- `@Entity` : Marque la classe comme entité persistante
- `@Id` : Définit la clé primaire
- `@GeneratedValue` : Auto-incrémentation de l'ID

Attributs :
- `id` (int)
- `name` (String)
- `price` (double)

---

## Interface DAO
Interface générique `IDao<T>` avec les méthodes CRUD :
- `create(T o)` : Créer une entité
- `delete(T o)` : Supprimer une entité
- `update(T o)` : Mettre à jour une entité
- `findById(int id)` : Rechercher par ID
- `findAll()` : Récupérer toutes les entités

---

## Implémentation DAO
La classe `ProductDaoImpl` implémente `IDao<Product>` avec :
- `@Repository` : Composant Spring pour l'accès aux données
- `@Transactional` : Gestion automatique des transactions
- `@Autowired SessionFactory` : Injection de la fabrique de sessions Hibernate

---

## Configuration Spring/Hibernate
La classe `HibernateConfig` configure :
- `@Configuration` : Classe de configuration Spring
- `@ComponentScan` : Détection automatique des composants
- `@EnableTransactionManagement` : Active la gestion des transactions

**3 Beans créés :**
1. `DataSource` : Connexion à MySQL
2. `SessionFactory` : Fabrique de sessions Hibernate
3. `TransactionManager` : Gestionnaire de transactions

---

## Test de configuration (TestHibernate)
<img width="650" height="215" alt="Screenshot 2025-11-26 012853" src="https://github.com/user-attachments/assets/333b35ef-07eb-4a48-b926-eb352daaa8dd" />


Le test vérifie que :
- `SessionFactory` est bien configuré ✅
- `TransactionManager` est bien configuré ✅

**Résultat attendu :**
```
SessionFactory is configured correctly.
Transaction Manager is configured correctly.
```

---

## 🧪 Test CRUD (Presentation2)

<img width="682" height="397" alt="Screenshot 2025-11-26 012836" src="https://github.com/user-attachments/assets/4d57b94b-25a9-4dad-9b7d-c1ac73e4bbb2" />

Le test démontre :
1. Création d'un produit
2. Sauvegarde en base de données
3. Affichage de tous les produits

**Résultat attendu :**
```
Hibernate: insert into product (name, price) values (?, ?)
Produit sauvegardé : Produit 1

=== Liste de tous les produits ===
Product{id=1, name='Produit 1', price=100.0}
```

---

## Base de données MySQL

<img width="747" height="471" alt="image" src="https://github.com/user-attachments/assets/e9d918f8-c318-40ee-95ec-06cbaa9f7e89" />


La table `product` est créée automatiquement par Hibernate avec :
- `id` : Clé primaire auto-incrémentée
- `name` : VARCHAR(255)
- `price` : DOUBLE
Hibernate génère automatiquement les requêtes SQL :
- `CREATE TABLE` : Création de la table
- `INSERT INTO` : Insertion des données
- `SELECT` : Récupération des données

---

## Concepts clés appris

**Injection de dépendances** avec Spring  
**ORM (Object-Relational Mapping)** avec Hibernate  
**Gestion des transactions** avec `@Transactional`  
**Pattern DAO** pour l'accès aux données  
**Configuration Spring** avec annotations  
**Annotations JPA** (`@Entity`, `@Id`, `@GeneratedValue`)  

---

## Comment exécuter le projet

### 1. Prérequis
- Java 11+
- Maven
- MySQL 8.0+

### 2. Créer la base de données
```sql
CREATE DATABASE base;
```

### 3. Compiler le projet
```bash
mvn clean compile
```

### 4. Exécuter les tests
- Lancer `TestHibernate.java`
- Lancer `Presentation2.java`

---

## Conclusion

Ce TP a permis de comprendre :
- L'intégration de Spring avec Hibernate
- La configuration d'une application avec annotations
- La gestion automatique des transactions
- Le mapping objet-relationnel (ORM)


---

**Arroche aya**

# 📸 Guide pour faire les captures d'écran

## Liste des captures à faire (11 au total)

### 1️⃣ Structure du projet
**Fichier :** `01-structure-projet.png`
- Dans IntelliJ, panneau de gauche (Project Explorer)
- Montrer l'arborescence complète du projet
- **Raccourci :** `Windows + Shift + S` → Sélectionner la zone

---

### 2️⃣ Fichier pom.xml
**Fichier :** `02-pom-xml.png`
- Ouvrir `pom.xml`
- Montrer la section `<dependencies>`

---

### 3️⃣ Fichier application.properties
**Fichier :** `03-application-properties.png`
- Ouvrir `src/main/resources/application.properties`
- Montrer toute la configuration

---

### 4️⃣ Entité Product.java
**Fichier :** `04-entity-product.png`
- Ouvrir `src/main/java/entities/Product.java`
- Montrer la classe avec les annotations `@Entity`, `@Id`, `@GeneratedValue`

---

### 5️⃣ Interface IDao.java
**Fichier :** `05-interface-dao.png`
- Ouvrir `src/main/java/dao/IDao.java`
- Montrer l'interface avec les 5 méthodes

---

### 6️⃣ Implémentation ProductDaoImpl.java
**Fichier :** `06-dao-implementation.png`
- Ouvrir `src/main/java/metier/ProductDaoImpl.java`
- Montrer les annotations `@Repository`, `@Transactional`

---

### 7️⃣ Configuration HibernateConfig.java
**Fichier :** `07-hibernate-config.png`
- Ouvrir `src/main/java/util/HibernateConfig.java`
- Montrer les 3 méthodes `@Bean`

---

### 8️⃣ Exécution de TestHibernate
**Fichier :** `08-test-hibernate.png`
- Lancer `TestHibernate.java` (clic droit → Run)
- Capturer la console avec le résultat :
  ```
  SessionFactory is configured correctly.
  Transaction Manager is configured correctly.
  ```

---

### 9️⃣ Exécution de Presentation2
**Fichier :** `09-presentation2.png`
- Lancer `Presentation2.java`
- Capturer la console avec :
  ```
  Produit sauvegardé : Produit 1
  === Liste de tous les produits ===
  Product{id=1, name='Produit 1', price=100.0}
  ```

---

### 🔟 Table product dans MySQL (optionnel)
**Fichier :** `10-mysql-table.png`
- Ouvrir MySQL Workbench ou ligne de commande
- Exécuter :
  ```sql
  USE base;
  DESCRIBE product;
  SELECT * FROM product;
  ```
- Capturer le résultat

---

### 1️⃣1️⃣ Requêtes SQL générées
**Fichier :** `11-sql-queries.png`
- Dans la console de `Presentation2`
- Montrer les requêtes SQL générées par Hibernate :
  ```sql
  Hibernate: insert into product (name, price) values (?, ?)
  Hibernate: select product0_.id as id1_0_...
  ```

---

## 💡 Astuces

### Comment faire une capture d'écran sur Windows :
1. **`Windows + Shift + S`** → Sélectionner une zone
2. La capture est copiée dans le presse-papiers
3. Ouvrir Paint (`mspaint`)
4. Coller (`Ctrl + V`)
5. Enregistrer dans le dossier `screenshots/` avec le bon nom

### Noms des fichiers :
- Utilisez exactement les noms indiqués (ex: `01-structure-projet.png`)
- Enregistrez dans le dossier `screenshots/`

---

## ✅ Checklist

- [ ] 01-structure-projet.png
- [ ] 02-pom-xml.png
- [ ] 03-application-properties.png
- [ ] 04-entity-product.png
- [ ] 05-interface-dao.png
- [ ] 06-dao-implementation.png
- [ ] 07-hibernate-config.png
- [ ] 08-test-hibernate.png
- [ ] 09-presentation2.png
- [ ] 10-mysql-table.png (optionnel)
- [ ] 11-sql-queries.png

---

Une fois toutes les captures faites, votre README sera complet ! 🎉

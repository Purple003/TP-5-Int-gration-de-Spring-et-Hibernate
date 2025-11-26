# Instructions pour démarrer MySQL et créer la base de données

## ⚠️ IMPORTANT : Vous DEVEZ faire ces étapes AVANT de lancer le projet !

## Étape 1 : Vérifier si MySQL est installé

Ouvrez PowerShell ou l'invite de commandes et tapez :
```bash
mysql --version
```

**Si vous voyez une version** (ex: `mysql Ver 8.0.xx`) → MySQL est installé ✅
**Si vous voyez une erreur** → MySQL n'est PAS installé ❌

---

## Étape 2 : Démarrer le serveur MySQL

### Option A : Via les Services Windows
1. Appuyez sur `Windows + R`
2. Tapez `services.msc` et appuyez sur Entrée
3. Cherchez **"MySQL"** ou **"MySQL80"** dans la liste
4. Clic droit → **Démarrer**

### Option B : Via la ligne de commande (en tant qu'administrateur)
```bash
net start MySQL80
```

---

## Étape 3 : Créer la base de données "base"

### Ouvrir MySQL en ligne de commande :
```bash
mysql -u root -p
```

Si on vous demande un mot de passe :
- Tapez votre mot de passe MySQL
- OU appuyez juste sur **Entrée** si vous n'avez pas de mot de passe

### Créer la base de données :
```sql
CREATE DATABASE base;
```

### Vérifier que la base existe :
```sql
SHOW DATABASES;
```

Vous devriez voir `base` dans la liste.

### Quitter MySQL :
```sql
exit;
```

---

## Étape 4 : Modifier le mot de passe dans application.properties (si nécessaire)

Si votre MySQL a un mot de passe, modifiez cette ligne dans `application.properties` :

```properties
spring.datasource.password=VOTRE_MOT_DE_PASSE
```

---

## Étape 5 : Recharger Maven dans IntelliJ

1. Clic droit sur `pom.xml` → **Maven** → **Reload Project**
2. Attendez que Maven télécharge MySQL Connector

---

## Étape 6 : Lancer le projet

1. Exécutez `TestHibernate.java`
2. Exécutez `Presentation2.java`

---

## ❌ Si MySQL n'est PAS installé

### Télécharger MySQL :
https://dev.mysql.com/downloads/installer/

### Ou utiliser XAMPP (plus simple) :
https://www.apachefriends.org/fr/index.html

XAMPP inclut MySQL et vous permet de le démarrer facilement avec un bouton.

---

## 🆘 Besoin d'aide ?

Si vous avez des erreurs, dites-moi :
1. Est-ce que MySQL est installé ?
2. Est-ce que le serveur MySQL est démarré ?
3. Quel message d'erreur voyez-vous ?

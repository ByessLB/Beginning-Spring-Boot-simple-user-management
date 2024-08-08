# Maven

Maven est un outil d'automatisation de build développé en JAva. Il est principalement utilisé pour les projets basés sur Java pour gérer le processus de build y compris la compilation du code source, les test, le packaging, et plus encore.

## Caractéristiques principales du Maven :

- **Gestion des dépendances** : Maven simplifie l'inclusion de bibliothèques externes dans votre projet et peut télécharger automatiquement les bibliothèques nécessaires.

- **Structure de projet standardisée** : Il fournit une structure de dossier de projet standard, ce qui facilite la navigation et la gestion du projet.

- **Cycle de vie de build** : Maven utilise différents phases de build pour construire le projet, comme la compilation, les tests, le packaging, etc.

- **Plugins** : Il supporte différents plugins pour effectuer des tâches comme la compilation, les tests, le packaging, le déploiement, la génération de documentation, et plus encore.

- **Modèle d'objet de projet (POM)** : Chaque projet Maven a un fichier `pom.xml` qui définit la configuration du projet et la gestion des dépendances.

- **Référentiel central** : Maven utilise un référentiel central pour télécharger les dépendances du projet, ce qui simplifie la gestion des dépendances.

- **Intégrtation IDE** : Il supporte différents environnements de développement intégré (IDE) comme STS, IntelliJ IDEA, VsCode, et NetBeans.

## Structure du projet Maven :

- `src/main/java` : Contient le code source principal en Java.

- `src/main/resources` : Contient les resources non-Java utilisées par l'application.

- `src/main/webapp` : Contient les ressources pour les applications web.

- `src/test/java` : Contient le code source des tests.

- `src/test/resources` : Contient les ressources utilisées pour les tests.

- `target` : Contient les classes compilées, les JARs/WARs packagés, et autres artefacts construits.

- `pom.xml` : Le fichier de modèle d'objet de projet qui définit la configuration du projet, les dépendances, et les paramètres de build.

**Source** : https://maven.apache.org/what-is-maven.html
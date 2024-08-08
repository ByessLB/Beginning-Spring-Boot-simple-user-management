# Spring Boot Dev Tools

Le module `spring-boot-devtools` fournit des outils supplémentaires pour améliorer l'expérience de développement. Il inclut des fonctionnalités comme le redémarrage automatique et le rechargement en direct.

## Fonctionnalités principales :

1. **Redémarrage automatique** : Lorsque des fichiers changent dans le classpath, l'application redémarre automatiquement, ce qui réduit le temps nécessaire pour vérifier les modifications.

2. **LiveReload** : Intègre un serveur LiveReload embargué qui peut déclencher un rafraîchissement du navigateur lorsque des ressource sont modifiées.

3. **Désactivation automatique en production** : Les outils de développement sont automatiquement désactivés lorsque l'application est entièrement packagée et exécutée en production.

4. **Propriétés par défaut** : Désactive automatiquement le cache pour les moteurs de templates comme Thymeleaf pendant le développement, permettant de voir les changements immédiatement.

Ref : https://docs.spring.io/spring-boot/reference/using/devtools.html
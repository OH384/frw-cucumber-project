#language: fr
@bouletcorp
Fonctionnalité: Je souhaite verifier les widgets du site bouletcorp
  
  Scénario: Je verifie le changement de page
   Etant donné Je me rend sur le site bouletcorp "bouletcorp.url"
   Quand Je clique sur l'onglet Apropos
   Alors La page a changé
   Et Les widgets twitch octodon et instagram sont bien affiches

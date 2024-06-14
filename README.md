# desafio-poo-iphone
``` mermaid
---
title: Iphone
---
classDiagram

    class ReprodutorMusical{
        +tocar()void
        +pausar()void
    }

    class Itunes{

    }
    ReprodutorMusical<--Itunes 

    class AparelhoTelefonico{
        +ligar(String Numero)void
        +atender()void
        +iniciarCorreioVoz()void
    }

    class NavegadorInternet{
        +exibirPagina(String url)void
        +adcionarNovaAba()void
        +atualizarPagina()void
    }

    class GoogleChrome{

    }   

    class Safari{

    }

    NavegadorInternet<--Safari
    NavegadorInternet<--GoogleChrome
    class Iphone{

    }
    Iphone-->ReprodutorMusical
    Iphone-->AparelhoTelefonico
    Iphone-->NavegadorInternet
```

Scala Workshop - Oppgaver
=========================

simple-build-tool
-----------------

Alle øvelsene bruker simple-build-tool (sbt). Det ligger med en egen launcher som laster ned alt du trenger, inkl. Scala. sbt brukes som et interaktivt shell. Start derfor sbt før du begynner med oppgaven. Start-script ligger i roten av oppgaven.

Under er noen vanlig sbt-kommandoer.

* update (Hente alle avhengigheter. OBS: Må kjøres før man kan begynne å jobbe)
* idea (Generer Intellij IDEA prosjektfiler. Tilsvarende Maven's idea:idea)
* compile
* clean
* jetty-run
* jetty-stop
* jetty-restart
* prepare-webapp (Oppdater web-ressurser (html, css, ...) for en kjørende Jetty-instans. Du slipper å restarte Jetty)
* exit

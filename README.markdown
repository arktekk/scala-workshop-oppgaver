Scala Workshop - Oppgaver
=========================

simple-build-tool
-----------------

Alle øvelsene bruker simple-build-tool (sbt). Det ligger med en egen launcher som laster ned alt du trenger, inkl. Scala. sbt brukes som et interaktivt shell. Start derfor sbt før du begynner med oppgaven. Start-script ligger i roten av oppgaven.

Under er noen vanlig sbt-kommandoer.

* gen-idea (Generer IntelliJ IDEA prosjektfiler. Tilsvarende Maven's idea:idea)
* eclipse (Generer Eclipse prosjektfiler)
* compile
* clean
* jetty-run
* jetty-stop
* jetty-restart
* prepare-webapp (Oppdater web-ressurser (html, css, ...) for en kjørende Jetty-instans. Du slipper å restarte Jetty)
* console (Starter Scala REPL med prosjektets dependencies på classpath)
* exit

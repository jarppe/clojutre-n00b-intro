(defproject clojutre-n00b-intro "0.1.0-SNAPSHOT"
  :description "clojuTRE 2012 - Clojure hands-on intro for newbies"
  :url "http://clojutre.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [noir "1.3.0-beta10" :exclusions [org.clojure/clojure]]
                 [enlive "1.0.1"]
                 [hiccup "1.0.1"]]
  :profiles {:dev {:dependencies [[midje "1.4.0" :exclusions [org.clojure/clojure]]
                                  [clj-webdriver "0.6.0-alpha11"]]
                   :plugins [[lein-midje "2.0.0-SNAPSHOT"]]}}
  :main intro.core
  :repl-options {:init-ns intro.core}
  :min-lein-version "2.0.0")

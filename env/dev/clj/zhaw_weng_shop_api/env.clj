(ns zhaw-weng-shop-api.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [zhaw-weng-shop-api.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[zhaw_weng_shop_api started successfully using the development profile]=-"))
   :middleware wrap-dev})

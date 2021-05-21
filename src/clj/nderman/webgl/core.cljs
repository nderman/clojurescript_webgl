(ns nderman.webgl.core
  (:require [thi.ng.geom.gl.core :as gl]))
(enable-console-print!)

(defonce gl-ctx (gl/gl-context "main"))

(doto gl-ctx
  (gl/clear-color-and-depth-buffer 0 0 0 1 1))
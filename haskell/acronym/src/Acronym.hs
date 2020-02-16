module Acronym (abbreviate) where

import Data.Char
import qualified Data.Text as T

abbreviate :: String -> String
abbreviate xs = map (toUpper . head . T.unpack) (T.splitOn (T.pack " ") (T.pack xs))

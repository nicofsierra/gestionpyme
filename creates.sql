CREATE TABLE `administrador` (
  `externo` bit(1) DEFAULT NULL,
  `idUsuario` bigint(20) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  CONSTRAINT `FKge9cmhbes1fii5xiau5ow6mgu` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `direccion` (
  `idDireccion` bigint(20) NOT NULL AUTO_INCREMENT,
  `calle` varchar(255) DEFAULT NULL,
  `dpto` int(11) DEFAULT NULL,
  `entreCalle1` varchar(255) DEFAULT NULL,
  `entreCalle2` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `piso` int(11) DEFAULT NULL,
  `localidad` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idDireccion`),
  KEY `FK335nxcx6r0q63ll4wl3hxu9kj` (`localidad`),
  CONSTRAINT `FK335nxcx6r0q63ll4wl3hxu9kj` FOREIGN KEY (`localidad`) REFERENCES `localidad` (`idLocalidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cliente` (
  `idCliente` bigint(20) NOT NULL AUTO_INCREMENT,
  `cuit` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `direccion` bigint(20) DEFAULT NULL,
  `empleado` bigint(20) DEFAULT NULL,
  `situacion` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idCliente`),
  KEY `FK4y91deom8ewsh6g1c8jc5tvbt` (`direccion`),
  KEY `FKs0yrif0t1cg01mmcxdeejvyjh` (`empleado`),
  KEY `FK573qgk8tx8rg6qd43xtfp0myu` (`situacion`),
  CONSTRAINT `FK4y91deom8ewsh6g1c8jc5tvbt` FOREIGN KEY (`direccion`) REFERENCES `direccion` (`idDireccion`),
  CONSTRAINT `FK573qgk8tx8rg6qd43xtfp0myu` FOREIGN KEY (`situacion`) REFERENCES `situacionafip` (`idSituacion`),
  CONSTRAINT `FKs0yrif0t1cg01mmcxdeejvyjh` FOREIGN KEY (`empleado`) REFERENCES `empleado` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `empleado` (
  `legajo` int(11) DEFAULT NULL,
  `idUsuario` bigint(20) NOT NULL,
  `idAdm` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `FKnu07pnn885fq6c9kncie56otx` (`idAdm`),
  CONSTRAINT `FKd08jp17tmpf94fs7wwe3ix9xe` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`),
  CONSTRAINT `FKnu07pnn885fq6c9kncie56otx` FOREIGN KEY (`idAdm`) REFERENCES `administrador` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tipofactura` (
  `idTipo` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `stock` (
  `idStock` bigint(20) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`idStock`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `situacionafip` (
  `idSituacion` bigint(20) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idSituacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `provincia` (
  `idProvincia` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `pais` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idProvincia`),
  KEY `FKhoe7ga52cdy3xh06ernylq8yr` (`pais`),
  CONSTRAINT `FKhoe7ga52cdy3xh06ernylq8yr` FOREIGN KEY (`pais`) REFERENCES `pais` (`idProvincia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `producto` (
  `idProducto` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio_unitario` float DEFAULT NULL,
  `administrador` bigint(20) DEFAULT NULL,
  `stock` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `FK8isub6v9vyfnvwc48jtdv8qxv` (`administrador`),
  KEY `FKglwvhs7oc6g9vrynyc4pdsyd6` (`stock`),
  CONSTRAINT `FK8isub6v9vyfnvwc48jtdv8qxv` FOREIGN KEY (`administrador`) REFERENCES `administrador` (`idUsuario`),
  CONSTRAINT `FKglwvhs7oc6g9vrynyc4pdsyd6` FOREIGN KEY (`stock`) REFERENCES `stock` (`idStock`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `partido` (
  `idPartido` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `provincia` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idPartido`),
  KEY `FK2ji8bro6blddw1q010eytatbk` (`provincia`),
  CONSTRAINT `FK2ji8bro6blddw1q010eytatbk` FOREIGN KEY (`provincia`) REFERENCES `provincia` (`idProvincia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pais` (
  `idProvincia` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idProvincia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `localidad` (
  `idLocalidad` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `partido` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idLocalidad`),
  KEY `FK2wqd6bjo5o0tslvp3ot635c63` (`partido`),
  CONSTRAINT `FK2wqd6bjo5o0tslvp3ot635c63` FOREIGN KEY (`partido`) REFERENCES `partido` (`idPartido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `factura` (
  `idFactura` bigint(20) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `importe` float DEFAULT NULL,
  `cliente` bigint(20) DEFAULT NULL,
  `empleado` bigint(20) DEFAULT NULL,
  `tipo` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idFactura`),
  KEY `FKqy3xtll6g1kkkffpvti9bf6w5` (`cliente`),
  KEY `FKcxdubwjnamhjryg4es8pmge92` (`empleado`),
  KEY `FK8xkr22lqx54g86ke511vpbkq9` (`tipo`),
  CONSTRAINT `FK8xkr22lqx54g86ke511vpbkq9` FOREIGN KEY (`tipo`) REFERENCES `tipofactura` (`idTipo`),
  CONSTRAINT `FKcxdubwjnamhjryg4es8pmge92` FOREIGN KEY (`empleado`) REFERENCES `empleado` (`idUsuario`),
  CONSTRAINT `FKqy3xtll6g1kkkffpvti9bf6w5` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `usuario` (
  `idUsuario` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `factura_producto` (
  `factura` bigint(20) NOT NULL,
  `producto` bigint(20) NOT NULL,
  KEY `FKm04jg09sutw32noog2ypchmw4` (`producto`),
  KEY `FKe2lxxlnwh66ayy3h4bygr3mkw` (`factura`),
  CONSTRAINT `FKe2lxxlnwh66ayy3h4bygr3mkw` FOREIGN KEY (`factura`) REFERENCES `factura` (`idFactura`),
  CONSTRAINT `FKm04jg09sutw32noog2ypchmw4` FOREIGN KEY (`producto`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


package uk.co.mjdk.idea
import doobie.implicits._
import io.github.gaelrenoux.tranzactio.doobie.{Database, tzio}
import zio.{Has, ZLayer}

object Bug {
  val foo: ZLayer[Database, Nothing, Has[Unit]] = ZLayer.fromFunction[Database, Unit] { (db: Database) =>
    val a = Database.transactionOrDie(tzio(sql"SELECT 42".query[Int].unique)).provide(db)
  }
}

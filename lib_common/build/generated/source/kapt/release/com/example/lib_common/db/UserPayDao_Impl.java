package com.example.lib_common.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserPayDao_Impl implements UserPayDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserPayData> __insertionAdapterOfUserPayData;

  private final EntityDeletionOrUpdateAdapter<UserPayData> __deletionAdapterOfUserPayData;

  private final EntityDeletionOrUpdateAdapter<UserPayData> __updateAdapterOfUserPayData;

  private final SharedSQLiteStatement __preparedStmtOfDeletePayData;

  public UserPayDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserPayData = new EntityInsertionAdapter<UserPayData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `UserPayData` (`id`,`orderId`,`purchaseToken`,`dramaSeriesId`,`episodeNumber`,`productId`,`purchaseOrder`,`eventType`,`userId`,`creationTime`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserPayData value) {
        stmt.bindLong(1, value.getId());
        if (value.getOrderId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOrderId());
        }
        if (value.getPurchaseToken() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPurchaseToken());
        }
        stmt.bindLong(4, value.getDramaSeriesId());
        stmt.bindLong(5, value.getEpisodeNumber());
        if (value.getProductId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProductId());
        }
        if (value.getPurchaseOrder() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPurchaseOrder());
        }
        stmt.bindLong(8, value.getEventType());
        stmt.bindLong(9, value.getUserId());
        stmt.bindLong(10, value.getCreationTime());
      }
    };
    this.__deletionAdapterOfUserPayData = new EntityDeletionOrUpdateAdapter<UserPayData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserPayData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserPayData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfUserPayData = new EntityDeletionOrUpdateAdapter<UserPayData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserPayData` SET `id` = ?,`orderId` = ?,`purchaseToken` = ?,`dramaSeriesId` = ?,`episodeNumber` = ?,`productId` = ?,`purchaseOrder` = ?,`eventType` = ?,`userId` = ?,`creationTime` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserPayData value) {
        stmt.bindLong(1, value.getId());
        if (value.getOrderId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOrderId());
        }
        if (value.getPurchaseToken() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPurchaseToken());
        }
        stmt.bindLong(4, value.getDramaSeriesId());
        stmt.bindLong(5, value.getEpisodeNumber());
        if (value.getProductId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProductId());
        }
        if (value.getPurchaseOrder() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPurchaseOrder());
        }
        stmt.bindLong(8, value.getEventType());
        stmt.bindLong(9, value.getUserId());
        stmt.bindLong(10, value.getCreationTime());
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfDeletePayData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from UserPayData where productId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final UserPayData bean) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserPayData.insert(bean);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<? extends UserPayData> bean) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserPayData.insert(bean);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final UserPayData bean) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserPayData.handle(bean);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final UserPayData bean) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUserPayData.handle(bean);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object deletePayData(final String productId,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePayData.acquire();
        int _argIndex = 1;
        if (productId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, productId);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeletePayData.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getAll(final int userID,
      final Continuation<? super List<UserPayData>> continuation) {
    final String _sql = "select * from UserPayData where userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userID);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserPayData>>() {
      @Override
      public List<UserPayData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "orderId");
          final int _cursorIndexOfPurchaseToken = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseToken");
          final int _cursorIndexOfDramaSeriesId = CursorUtil.getColumnIndexOrThrow(_cursor, "dramaSeriesId");
          final int _cursorIndexOfEpisodeNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeNumber");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
          final int _cursorIndexOfPurchaseOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseOrder");
          final int _cursorIndexOfEventType = CursorUtil.getColumnIndexOrThrow(_cursor, "eventType");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfCreationTime = CursorUtil.getColumnIndexOrThrow(_cursor, "creationTime");
          final List<UserPayData> _result = new ArrayList<UserPayData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserPayData _item;
            _item = new UserPayData();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            _item.setOrderId(_tmpOrderId);
            final String _tmpPurchaseToken;
            if (_cursor.isNull(_cursorIndexOfPurchaseToken)) {
              _tmpPurchaseToken = null;
            } else {
              _tmpPurchaseToken = _cursor.getString(_cursorIndexOfPurchaseToken);
            }
            _item.setPurchaseToken(_tmpPurchaseToken);
            final int _tmpDramaSeriesId;
            _tmpDramaSeriesId = _cursor.getInt(_cursorIndexOfDramaSeriesId);
            _item.setDramaSeriesId(_tmpDramaSeriesId);
            final int _tmpEpisodeNumber;
            _tmpEpisodeNumber = _cursor.getInt(_cursorIndexOfEpisodeNumber);
            _item.setEpisodeNumber(_tmpEpisodeNumber);
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            _item.setProductId(_tmpProductId);
            final String _tmpPurchaseOrder;
            if (_cursor.isNull(_cursorIndexOfPurchaseOrder)) {
              _tmpPurchaseOrder = null;
            } else {
              _tmpPurchaseOrder = _cursor.getString(_cursorIndexOfPurchaseOrder);
            }
            _item.setPurchaseOrder(_tmpPurchaseOrder);
            final int _tmpEventType;
            _tmpEventType = _cursor.getInt(_cursorIndexOfEventType);
            _item.setEventType(_tmpEventType);
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            _item.setUserId(_tmpUserId);
            final long _tmpCreationTime;
            _tmpCreationTime = _cursor.getLong(_cursorIndexOfCreationTime);
            _item.setCreationTime(_tmpCreationTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getPayData(final String productId,
      final Continuation<? super UserPayData> continuation) {
    final String _sql = "select * from UserPayData where productId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserPayData>() {
      @Override
      public UserPayData call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "orderId");
          final int _cursorIndexOfPurchaseToken = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseToken");
          final int _cursorIndexOfDramaSeriesId = CursorUtil.getColumnIndexOrThrow(_cursor, "dramaSeriesId");
          final int _cursorIndexOfEpisodeNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeNumber");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
          final int _cursorIndexOfPurchaseOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseOrder");
          final int _cursorIndexOfEventType = CursorUtil.getColumnIndexOrThrow(_cursor, "eventType");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfCreationTime = CursorUtil.getColumnIndexOrThrow(_cursor, "creationTime");
          final UserPayData _result;
          if(_cursor.moveToFirst()) {
            _result = new UserPayData();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            _result.setOrderId(_tmpOrderId);
            final String _tmpPurchaseToken;
            if (_cursor.isNull(_cursorIndexOfPurchaseToken)) {
              _tmpPurchaseToken = null;
            } else {
              _tmpPurchaseToken = _cursor.getString(_cursorIndexOfPurchaseToken);
            }
            _result.setPurchaseToken(_tmpPurchaseToken);
            final int _tmpDramaSeriesId;
            _tmpDramaSeriesId = _cursor.getInt(_cursorIndexOfDramaSeriesId);
            _result.setDramaSeriesId(_tmpDramaSeriesId);
            final int _tmpEpisodeNumber;
            _tmpEpisodeNumber = _cursor.getInt(_cursorIndexOfEpisodeNumber);
            _result.setEpisodeNumber(_tmpEpisodeNumber);
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            _result.setProductId(_tmpProductId);
            final String _tmpPurchaseOrder;
            if (_cursor.isNull(_cursorIndexOfPurchaseOrder)) {
              _tmpPurchaseOrder = null;
            } else {
              _tmpPurchaseOrder = _cursor.getString(_cursorIndexOfPurchaseOrder);
            }
            _result.setPurchaseOrder(_tmpPurchaseOrder);
            final int _tmpEventType;
            _tmpEventType = _cursor.getInt(_cursorIndexOfEventType);
            _result.setEventType(_tmpEventType);
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            _result.setUserId(_tmpUserId);
            final long _tmpCreationTime;
            _tmpCreationTime = _cursor.getLong(_cursorIndexOfCreationTime);
            _result.setCreationTime(_tmpCreationTime);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

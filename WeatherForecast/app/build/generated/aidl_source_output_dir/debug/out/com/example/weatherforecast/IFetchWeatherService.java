/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.example.weatherforecast;
public interface IFetchWeatherService extends android.os.IInterface
{
  /** Default implementation for IFetchWeatherService. */
  public static class Default implements com.example.weatherforecast.IFetchWeatherService
  {
    @Override public void retrieveWeatherData() throws android.os.RemoteException
    {
    }
    @Override public void registerFetchDataListener(com.example.weatherforecast.IFetchDataListener listener) throws android.os.RemoteException
    {
    }
    @Override public void unregisterFetchDataListener(com.example.weatherforecast.IFetchDataListener listener) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.example.weatherforecast.IFetchWeatherService
  {
    private static final java.lang.String DESCRIPTOR = "com.example.weatherforecast.IFetchWeatherService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.weatherforecast.IFetchWeatherService interface,
     * generating a proxy if needed.
     */
    public static com.example.weatherforecast.IFetchWeatherService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.example.weatherforecast.IFetchWeatherService))) {
        return ((com.example.weatherforecast.IFetchWeatherService)iin);
      }
      return new com.example.weatherforecast.IFetchWeatherService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_retrieveWeatherData:
        {
          data.enforceInterface(descriptor);
          this.retrieveWeatherData();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_registerFetchDataListener:
        {
          data.enforceInterface(descriptor);
          com.example.weatherforecast.IFetchDataListener _arg0;
          _arg0 = com.example.weatherforecast.IFetchDataListener.Stub.asInterface(data.readStrongBinder());
          this.registerFetchDataListener(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_unregisterFetchDataListener:
        {
          data.enforceInterface(descriptor);
          com.example.weatherforecast.IFetchDataListener _arg0;
          _arg0 = com.example.weatherforecast.IFetchDataListener.Stub.asInterface(data.readStrongBinder());
          this.unregisterFetchDataListener(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.example.weatherforecast.IFetchWeatherService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void retrieveWeatherData() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_retrieveWeatherData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().retrieveWeatherData();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void registerFetchDataListener(com.example.weatherforecast.IFetchDataListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerFetchDataListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerFetchDataListener(listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unregisterFetchDataListener(com.example.weatherforecast.IFetchDataListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterFetchDataListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unregisterFetchDataListener(listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.example.weatherforecast.IFetchWeatherService sDefaultImpl;
    }
    static final int TRANSACTION_retrieveWeatherData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_registerFetchDataListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_unregisterFetchDataListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(com.example.weatherforecast.IFetchWeatherService impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.example.weatherforecast.IFetchWeatherService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void retrieveWeatherData() throws android.os.RemoteException;
  public void registerFetchDataListener(com.example.weatherforecast.IFetchDataListener listener) throws android.os.RemoteException;
  public void unregisterFetchDataListener(com.example.weatherforecast.IFetchDataListener listener) throws android.os.RemoteException;
}
